package com.learningportal.learningportalproject.service.impl;

import java.time.LocalDateTime;
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

	public List<CourseEntity> findAllCourse() {
		return courseRepository.findAll();
	}

	public Optional<CourseEntity> findByCourseID(Long courseID) {
		return courseRepository.findById(courseID);
	}

	public CourseEntity saveCourse(CourseEntity course) {
		course.setCreatedOn(LocalDateTime.now());
		course.setUpdatedOn(LocalDateTime.now());
		return courseRepository.save(course);
	}

	public CourseEntity updateCourse(CourseEntity course) {
		course.setUpdatedOn(LocalDateTime.now());
		return courseRepository.save(course);
	}

	public void deleteCourse(Long courseID) {
		courseRepository.deleteById(courseID);
	}
}
