package com.learningportal.learningportalproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course_entity")
public class CourseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private long courseID;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "course_cost")
	private int courseCost;
	
	@Column(name = "course_rating")
	private int courseRating;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@ManyToOne
	@JoinColumn(name = "course_category")
	private CourseCategoryEntity category;
	
	@OneToOne
	@JoinColumn(name = "is_favourite")
	private FavEntity favorite;
	
	public CourseEntity()
	{
		
	}
	
	
	// course entity - courseID , courseName , coursecost, courserating
	
	
	public CourseEntity(Long courseID, String courseName, int courseCost, int courseRating ) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseCost = courseCost;
		this.courseRating = courseRating ;
	}

	public long getcourseId() {
		return courseID;
	}

	public void setcourseId(long courseID) {
		this.courseID = courseID;
	}

	public String getcourseName() {
		return courseName;
	}

	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getcourseCost() {
		return courseCost;
	}

	public void setCourseCost(int courseCost) {
		this.courseCost = courseCost;
	}
	
	public int getcourseRating() {
		return courseRating;
	}

	public void setcourseRating(int courseRating) {
		this.courseRating = courseRating;
	}
}




