package com.learningportal.learningportalproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningportal.learningportalproject.entity.CourseEntity;
import com.learningportal.learningportalproject.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	private CourseService courseService;

	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@GetMapping
	public List<CourseEntity> findAllCourse() {
		return courseService.findAllCourse();
	}

	@GetMapping("/{id}")
	public Optional<CourseEntity> findCoursebyCourseID(@PathVariable("id") Long courseID) {
		return courseService.findByCourseID(courseID);
	}

	@PostMapping
	public CourseEntity saveCourse(@RequestBody CourseEntity courseEntity) {
		return courseService.saveCourse(courseEntity);
	}

	@PutMapping
	public CourseEntity updateCourse(@RequestBody CourseEntity courseEntity) {
		return courseService.updateCourse(courseEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable("id") Long courseID) {
		courseService.deleteCourse(courseID);
	}
}
