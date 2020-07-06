package com.Security.SpringSecure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface UserRepository extends JpaRepository<User,Integer> {
 
	//The interface to get JpaRepository existing crud operations
	

}
