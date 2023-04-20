/**
 * 
 */
package com.usersystem.services;

import java.util.List;

import com.usersystem.entities.User;


/**
 * @author vijay
 *
 */

public interface UserService {

	//create a new user
	User saveUser(User user);
	
	//get all users
	List<User> getAllUser();
	
	//get user with Id
	User getUser(String userId);
	
	// delete and update
	
}
