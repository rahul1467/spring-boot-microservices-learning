package com.in28minutes.microservices.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.userservice.bean.User;
import com.in28minutes.microservices.userservice.configuration.Configuration;

@RestController
public class UserController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/user")
	public User retrieveUser() {
		return new User(configuration.getName(), configuration.getEmail());
	}
}
