package com.learningportal.learningportalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningportal.learningportalproject.dto.CourseDto;
import com.learningportal.learningportalproject.service.CourseService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/course")

public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping(value = "/getAllCourses", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CourseDto> findAllCourses() {
		List<CourseDto> data = courseService.findAllCourse();
		return data;
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseDto findCourseById(@PathVariable Long id) {
		return courseService.findById(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseDto saveCourse(@RequestBody CourseDto courseDto) {
		return courseService.saveCourse(courseDto);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CourseDto updateCategory(@RequestBody CourseDto updatedCourse, Long id) {
		return courseService.updateCourse(updatedCourse, id);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteCategory(@PathVariable Long id) {
		courseService.deleteCourse(id);
	}

}
