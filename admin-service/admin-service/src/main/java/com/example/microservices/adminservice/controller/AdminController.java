package com.example.microservices.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.adminservice.bean.Admin;
import com.example.microservices.adminservice.configuration.Configuration;

@RestController
public class AdminController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/admin")
	public Admin retrieveAdmin() {
		return new Admin(configuration.getUserName(), configuration.getPassword());
	}
}
