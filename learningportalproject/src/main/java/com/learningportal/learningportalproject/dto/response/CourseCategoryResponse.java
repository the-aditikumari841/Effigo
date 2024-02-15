package com.learningportal.learningportalproject.dto.response;

import java.io.Serializable;
import java.util.Date;

public class CourseCategoryResponse implements Serializable {
	
	private String courseCategory ;
	
	public CourseCategoryResponse() {
		
	}
	
	public String getName() {
		return courseCategory;
	}
	
	public void setName(String courseCategory) {
		this.courseCategory = courseCategory;
	}

}


// category entity - courseCategory 

