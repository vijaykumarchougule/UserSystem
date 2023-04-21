/**
 * 
 */
package com.usersystem.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vijay
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
	
	@Transient
	private List<Rating> ratings;
	
}
