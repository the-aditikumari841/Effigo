package com.learningportal.learningportalproject.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserRequest implements Serializable {
    private String userName;
    private String gender;
    private Date dateOfBirth;
    private String password;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
    
	// user entity - userID , userName , gender , dateOFBirth , password , createdOn , updatedOn
    

}

