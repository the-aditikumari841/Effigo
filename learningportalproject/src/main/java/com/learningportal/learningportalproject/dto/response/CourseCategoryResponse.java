package com.learningportal.learningportalproject.dto.response;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseCategoryResponse {
	@Id
	private String courseCategory;
}
