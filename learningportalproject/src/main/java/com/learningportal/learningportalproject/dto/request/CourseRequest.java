package com.learningportal.learningportalproject.dto.request;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseRequest {
	@Id
	private Long courseID;

	private String courseName;
	private int coursecost;
	private int courserating;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;

}
