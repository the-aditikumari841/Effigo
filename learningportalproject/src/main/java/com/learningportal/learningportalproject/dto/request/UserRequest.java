package com.learningportal.learningportalproject.dto.request;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserRequest {
	@Id
	private long userID;
	private String userName;
	private String gender;
	private Date dateOfBirth;
	private String password;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;

}
