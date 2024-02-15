package com.learningportal.learningportalproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.learningportal.learningportalproject.entity.CourseEntity;
import com.learningportal.learningportalproject.service.CourseService;


@RestController
@RequestMapping("/course")
public class CourseController {
	
	private final CourseService courseService;
	
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@GetMapping
	public List<CourseEntity> findAllCourse() {
		return courseService.findAllCourse();
	}
	
	@GetMapping("/{id}")
	public Optional<CourseEntity> findCoursebyCourseID(@PathVariable("id") Long courseID){
		return courseService.findById(courseID);
	}
	
	@PostMapping
	public CourseEntity saveCourse(@RequestBody CourseEntity courseEntity) {
		return courseService.saveCourse(courseEntity);
	}
	
	@PutMapping
	public CourseEntity updateCourse(@RequestBody CourseEntity courseEntity) {
		return  courseService.updateCourse(courseEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable("id") Long courseID) {
		courseService.deleteCourse(courseID);
	}
}



