package com.learningportal.learningportalproject.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course_category_entity")
public class CourseCategoryEntity {

	@Id
	@Column(name = "course_category")
	private String courseCategory;

	@Column(name = "created_on", updatable = false)
	private LocalDateTime createdOn;

	@Column(name = "updated_on", updatable = true)
	private LocalDateTime updatedOn;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;

}
