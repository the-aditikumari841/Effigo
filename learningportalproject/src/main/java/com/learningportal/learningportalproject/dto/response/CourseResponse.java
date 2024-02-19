package com.learningportal.learningportalproject.dto.response;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseResponse {
	@Id
	private Long courseID;
	private String courseName;
	private int courseCost;
	private int courseRating;

}
