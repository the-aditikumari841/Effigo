package com.learningportal.learningportalproject.service;

import java.util.List;

import java.util.Optional;

import com.learningportal.learningportalproject.entity.CourseCategoryEntity;

public interface CourseCategoryService {
	List<CourseCategoryEntity> findAllCourseCategory();
	CourseCategoryEntity saveCourseCategory(CourseCategoryEntity coursecategoryEntity);
	CourseCategoryEntity updateCourseCategory(CourseCategoryEntity coursecategoryEntity);
	void deleteCourseCategory(String courseCategory);
	Optional<CourseCategoryEntity> findByCourseCategory(String courseCategory);
}




