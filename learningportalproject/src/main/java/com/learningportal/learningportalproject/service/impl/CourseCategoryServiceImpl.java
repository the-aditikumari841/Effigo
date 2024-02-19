package com.learningportal.learningportalproject.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningportal.learningportalproject.entity.CourseCategoryEntity;
import com.learningportal.learningportalproject.repository.CourseCategoryRepository;
import com.learningportal.learningportalproject.service.CourseCategoryService;

@Service
public class CourseCategoryServiceImpl implements CourseCategoryService {

	@Autowired
	private CourseCategoryRepository coursecategoryRepository;

	public List<CourseCategoryEntity> findAllCourseCategory() {
		return coursecategoryRepository.findAll();
	}

	public Optional<CourseCategoryEntity> findByCourseCategory(String category) {
		return coursecategoryRepository.findByCourseCategory(category);
	}

	public CourseCategoryEntity saveCourseCategory(CourseCategoryEntity category) {
		category.setCreatedOn(LocalDateTime.now());
		category.setUpdatedOn(LocalDateTime.now());
		return coursecategoryRepository.save(category);
	}

	public CourseCategoryEntity updateCourseCategory(CourseCategoryEntity category) {
		return coursecategoryRepository.save(category);
	}

	public void deleteCourseCategory(String category) {
		coursecategoryRepository.deleteByCourseCategory(category);
	}

}
