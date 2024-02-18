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

public class CourseResponse implements Serializable {
	@Id
	private Long courseID ;
	private String courseName ;
	private int courseCost ;
	private int courseRating ;	

	
}



