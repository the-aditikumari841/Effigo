package com.learningportal.learningportalproject.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningportal.learningportalproject.entity.CourseEntity;
import com.learningportal.learningportalproject.repository.CourseRepository;
import com.learningportal.learningportalproject.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;
	


	@Override
	public List<CourseEntity> findAllCourse() {
		return courseRepository.findAll();
	}


	public Optional<CourseEntity> findByCourseID(Long courseID) {
		return courseRepository.findById(courseID);
	}

	@Override
	public CourseEntity saveCourse(CourseEntity courseEntity) {
		return courseRepository.save(courseEntity);
	}

	@Override
	public CourseEntity updateCourse(CourseEntity courseEntity) {
		return courseRepository.save(courseEntity);
	}

	@Override
	public void deleteCourse(Long courseID) {
		courseRepository.deleteById(courseID);
	}
}




