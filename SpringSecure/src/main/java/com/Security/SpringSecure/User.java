package com.Security.SpringSecure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private String location;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String firstname, String lastname, String location, int age) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
		this.age = age;
	}
	public User() {
		
	}

}
