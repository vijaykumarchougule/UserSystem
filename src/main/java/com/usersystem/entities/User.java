/**
 * 
 */
package com.usersystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vijay
 *
 */

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "Id")
	private String userId;
	@Column(name = "Name", length = 20)
	private String name;
	@Column(name = "mail")
	private String email;
	
	
}
