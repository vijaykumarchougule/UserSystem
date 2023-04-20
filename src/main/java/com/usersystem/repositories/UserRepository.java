/**
 * 
 */
package com.usersystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usersystem.entities.User;

/**
 * @author vijay
 *
 */

public interface UserRepository extends JpaRepository<User, String>{

}
