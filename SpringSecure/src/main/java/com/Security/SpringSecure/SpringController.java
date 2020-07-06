package com.Security.SpringSecure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SpringController {
	
	
	
	@Autowired
	private UserService uservice;
	
	@RequestMapping(value="/users",method =RequestMethod.GET)
	public List<User> getUsersDetails() {
		return uservice.findAll();
		
	}
	
	@RequestMapping(value="/users/{id}",method =RequestMethod.GET)
	public Optional<User> getUserDetails(@PathVariable int id) {
		return uservice.findbyId(id);
		
	}
	@PostMapping("/users")
	public User createUserDetails(@RequestBody User user) {
		return uservice.saveUser(user);
		
	}
	
	@DeleteMapping("/users/{id")
	public String deleteUserbyID(@PathVariable int id) {
		return uservice.deletebyID(id);
	}

}
