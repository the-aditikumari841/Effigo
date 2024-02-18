package com.learningportal.learningportalproject.dto.response;

import java.io.Serializable;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserResponse implements Serializable {
	@Id
	private Long userID ;
	private String userName ;
	private String gender ;
	private Date dateOfBirth ;
	private String password ;
		

}
	




