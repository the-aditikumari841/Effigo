package com.learningportal.learningportalproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course_category_entity")
public class CourseCategoryEntity {
	
	@Id
	@Column(name = "course_category")
	private String courseCategory;
	
	@Column(name = "created_on")
	private LocalDateTime createdOn;
	
	@Column(name = "updated_on")
	private LocalDateTime updatedOn;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;
	
	
	// category entity - courseCategory 
	
	/*public CourseCategoryEntity( String courseCategory ) {
		this.courseCategory = courseCategory;
	}
	
	public String getcourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}	*/

}



