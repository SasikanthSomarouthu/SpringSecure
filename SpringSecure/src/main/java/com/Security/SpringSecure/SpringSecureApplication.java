package com.Security.SpringSecure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringSecureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecureApplication.class, args);
		System.out.println("This is startup");
	}

}
