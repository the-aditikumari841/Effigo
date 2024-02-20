package com.learningportal.learningportalproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningportal.learningportalproject.entity.CourseCategoryEntity;
import com.learningportal.learningportalproject.service.CourseCategoryService;

@RestController
@RequestMapping("/coursecategory")
public class CourseCategoryController {

	@Autowired
	private CourseCategoryService coursecategoryService;

	@GetMapping
	public List<CourseCategoryEntity> findAllCourseCategory() {
		return coursecategoryService.findAllCourseCategory();
	}

	@GetMapping("/{id}")
	public Optional<CourseCategoryEntity> findCourseCategorybyCategory(@PathVariable("id") String courseCategory) {
		return coursecategoryService.findByCourseCategory(courseCategory);
	}

	@PostMapping
	public CourseCategoryEntity saveCourseCategory(@RequestBody CourseCategoryEntity coursecategoryEntity) {
		return coursecategoryService.saveCourseCategory(coursecategoryEntity);
	}

	@PutMapping
	public CourseCategoryEntity updateCourseCategory(@RequestBody CourseCategoryEntity coursecategoryEntity) {
		return coursecategoryService.updateCourseCategory(coursecategoryEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteCourseCategory(@PathVariable("id") String courseCategory) {
		coursecategoryService.deleteCourseCategory(courseCategory);
	}
}
