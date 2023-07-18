package com.greenstitch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greenstitch.model.User;
import com.greenstitch.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService customerService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@PostMapping("/signup")
	public String saveCustomerHandler(@RequestBody User user){

		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		customerService.registerUser(user);
		
		return "SignUp Successfull!";
		
	}
	

}
