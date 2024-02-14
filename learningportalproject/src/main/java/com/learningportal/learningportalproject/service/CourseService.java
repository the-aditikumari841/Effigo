package com.learningportal.learningportalproject.service;

import java.util.List;
import java.util.Optional;

import com.learningportal.learningportalproject.entity.CourseEntity;


public interface CourseService {
	List<CourseEntity> findAllCourse();
	Optional<CourseEntity> findById(Long courseID);
	CourseEntity saveCourse(CourseEntity courseEntity);
	CourseEntity updateCourse(CourseEntity courseEntity);
	void deleteCourse(Long courseID);
}



