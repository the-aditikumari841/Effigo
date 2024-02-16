package com.learningportal.learningportalproject.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.learningportal.learningportalproject.entity.CourseCategoryEntity;
import com.learningportal.learningportalproject.repository.CourseCategoryRepository;
import com.learningportal.learningportalproject.service.CourseCategoryService;

@Service
public class CourseCategoryServiceImpl implements CourseCategoryService {
	
	@Autowired
	private CourseCategoryRepository coursecategoryRepository;
	


	@Override
	public List<CourseCategoryEntity> findAllCourseCategory() {
		// TODO Auto-generated method stub
		return coursecategoryRepository.findAll();
	}

	@Override
	public Optional<CourseCategoryEntity> findByCourseCategory(String courseCategory) {
		// TODO Auto-generated method stub
		return coursecategoryRepository.findByCourseCategory(courseCategory);
	}

	@Override
	public CourseCategoryEntity saveCourseCategory(CourseCategoryEntity coursecategoryEntity) {
		// TODO Auto-generated method stub
		return coursecategoryRepository.save(coursecategoryEntity);
	}

	@Override
	public CourseCategoryEntity updateCourseCategory(CourseCategoryEntity coursecategoryEntity) {
		// TODO Auto-generated method stub
		return coursecategoryRepository.save(coursecategoryEntity);
	}

	@Override
	public void deleteCourseCategory(String courseCategory) {
		// TODO Auto-generated method stub
		coursecategoryRepository.deleteByCourseCategory(courseCategory);
	}
	
}







