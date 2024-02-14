package com.learningportal.learningportalproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course_category_entity")
public class CourseCategoryEntity {
	
	@Id
	@Column(name = "course_category")
	private String courseCategory;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;
	
	public CourseCategoryEntity()
	{
		
	}
	
	// category entity - courseCategory 
	
	public CourseCategoryEntity( String courseCategory ) {
		this.courseCategory = courseCategory;
	}
	
	public String getcourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}	

}





