package com.Security.SpringSecure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userepo;
	
	
	public Optional<User> findbyId(int id) {
		return userepo.findById(id);
	}
	
	public List<User> findAll(){
		return userepo.findAll();
		
	}
	
	public String deletebyID(int id) {
	 	userepo.deleteById(id);
	 	if(userepo.findById(id) != null) {
	 		return "Operation Failed";
	 	}
		return "Userdeleted";
		
	}
	public User saveUser(User user) {
		return userepo.save(user);
	}

}
