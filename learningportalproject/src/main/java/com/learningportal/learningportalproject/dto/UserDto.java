package com.learningportal.learningportalproject.dto;

import java.sql.Timestamp;

import com.learningportal.learningportalproject.entity.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private long userId;
	private String username;
	private String password;
	private UserRole role;
	private Timestamp createdOn;
	private Timestamp updatedOn;
}
