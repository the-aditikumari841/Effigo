package com.learningportal.learningportalproject.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.learningportal.learningportalproject.entity.CourseEntity;
import com.learningportal.learningportalproject.repository.CourseRepository;
import com.learningportal.learningportalproject.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService {
	
	private CourseRepository courseRepository;
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<CourseEntity> findAllCourse() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}


	public Optional<CourseEntity> findByCourseID(Long courseID) {
		// TODO Auto-generated method stub
		return courseRepository.findById(courseID);
	}

	@Override
	public CourseEntity saveCourse(CourseEntity courseEntity) {
		// TODO Auto-generated method stub
		return courseRepository.save(courseEntity);
	}

	@Override
	public CourseEntity updateCourse(CourseEntity courseEntity) {
		// TODO Auto-generated method stub
		return courseRepository.save(courseEntity);
	}

	@Override
	public void deleteCourse(Long courseID) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(courseID);
	}
}




