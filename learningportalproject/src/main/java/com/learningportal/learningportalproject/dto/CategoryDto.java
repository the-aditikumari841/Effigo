package com.learningportal.learningportalproject.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
	private String categoryId;
	private String name;
	private Timestamp createdOn;
	private Timestamp updatedOn;
}
