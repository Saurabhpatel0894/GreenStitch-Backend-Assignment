package com.greenstitch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenstitch.dao.UserRepository;
import com.greenstitch.model.User;

@RestController
public class LoginController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/signIn")
	public String getLoggedInCustomerDetailsHandler(Authentication auth){
		
		
		 userRepository.findByEmail(auth.getName()).orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		
		
		 return "Hello from GreenStitch";
		
		
	}
	
}