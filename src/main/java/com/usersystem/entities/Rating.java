/**
 * 
 */
package com.usersystem.entities;

import lombok.AllArgsConstructor;
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
public class Rating {

	private String ratingId;
	
	private String userId;
	
	private String teacherId;
	
	private int rating;
	
	private String feedback;
	
}
