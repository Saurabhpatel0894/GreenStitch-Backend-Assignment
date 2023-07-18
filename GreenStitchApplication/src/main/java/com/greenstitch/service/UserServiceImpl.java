package com.greenstitch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenstitch.dao.UserRepository;
import com.greenstitch.model.User;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		
		return userRepository.save(user);
	}

}
