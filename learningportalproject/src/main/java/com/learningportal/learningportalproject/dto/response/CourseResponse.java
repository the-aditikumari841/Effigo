package com.learningportal.learningportalproject.dto.response;

import java.io.Serializable;
import java.util.Date;

public class CourseResponse implements Serializable {
	
	private Long courseID ;
	private String courseName ;
	private int courseCost ;
	private int courseRating ;
	
	public CourseResponse() {
		
	}
	
	public Long getCourseID() {
		return courseID;
	}
	
	public void setCourseID(Long courseID) {
		this.courseID = courseID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	//course entity - courseID , courseName , coursecost, courserating
	
	public int getCourseCost() {
		return courseCost;
	}
	
	public void setCourseCost(int courseCost) {
		this.courseCost = courseCost;
	}
	
	public int getCourseRating() {
		return courseRating;
	}
	
	public void setCourseRating(int courseRating) {
		this.courseRating = courseRating ;
	}
	
}

// course entity - courseID , courseName , coursecost, courserating


