package com.learningportal.learningportalproject.dto.response;

import java.util.Date;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserResponse {
	@Id
	private Long userID;
	private String userName;
	private String gender;
	private Date dateOfBirth;
	private String password;

}
