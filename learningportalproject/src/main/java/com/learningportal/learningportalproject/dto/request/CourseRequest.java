package com.learningportal.learningportalproject.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseRequest implements Serializable {
    private Long courseID;
    private String courseName;
    private int coursecost;
    private int courserating;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
    
	// course entity - courseID , courseName , coursecost, courserating , updatedOn ,  createdOn
	
	

}

