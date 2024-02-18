package com.learningportal.learningportalproject.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseRequest implements Serializable {
	@Id
    private Long courseID;
    
	private String courseName;
    private int coursecost;
    private int courserating;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
    

	
	

}

