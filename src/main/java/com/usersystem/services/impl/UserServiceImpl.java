/**
 * 
 */
package com.usersystem.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usersystem.entities.User;
import com.usersystem.exceptions.ResourceNotFoundException;
import com.usersystem.repositories.UserRepository;
import com.usersystem.services.UserService;

/**
 * @author vijay
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given Id not found"));
	}

}
