package com.learningportal.learningportalproject.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.learningportal.learningportalproject.entity.CourseCategoryEntity;
import com.learningportal.learningportalproject.service.CourseCategoryService;


@RestController
@RequestMapping("/coursecategory")
public class CourseCategoryController {
	
	private CourseCategoryService coursecategoryService;
	
	public CourseCategoryController(CourseCategoryService coursecategoryService) {
		this.coursecategoryService = coursecategoryService;
	}
	
	@GetMapping
	public List<CourseCategoryEntity> findAllCourseCategory() {
		return coursecategoryService.findAllCourseCategory();
	}
	
	@GetMapping("/{id}")
	public Optional<CourseCategoryEntity> findCourseCategorybyCategory(@PathVariable("id") String courseCategory){
		return coursecategoryService.findByCourseCategory(courseCategory);
	}
	
	@PostMapping
	public CourseCategoryEntity saveCourseCategory(@RequestBody CourseCategoryEntity coursecategoryEntity) {
		return coursecategoryService.saveCourseCategory(coursecategoryEntity);
	}
	
	@PutMapping
	public CourseCategoryEntity updateCourseCategory(@RequestBody CourseCategoryEntity coursecategoryEntity) {
		return  coursecategoryService.updateCourseCategory(coursecategoryEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCourseCategory(@PathVariable("id") String courseCategory) {
		coursecategoryService.deleteCourseCategory(courseCategory);
	}
}
