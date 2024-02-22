package com.learningportal.learningportalproject.service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningportal.learningportalproject.dto.CategoryDto;
import com.learningportal.learningportalproject.entity.CourseCategoryEntity;
import com.learningportal.learningportalproject.mappers.CategoryMapper;
import com.learningportal.learningportalproject.repository.CourseCategoryRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CourseCategoryService {
	@Autowired
	private CourseCategoryRepository categoryRepository;
	@Autowired
	private CategoryMapper categoryMapper;

	public List<CategoryDto> findAllCategory() {
		List<CourseCategoryEntity> coursecategoryEntity = categoryRepository.findAll();
		List<CategoryDto> categoryDtos = categoryMapper.toDto(coursecategoryEntity);
		return categoryDtos;
	}

	public CategoryDto findById(String courseCategory) {
		Optional<CourseCategoryEntity> optional = categoryRepository.findById(courseCategory);
		if (optional.isPresent()) {
			CourseCategoryEntity coursecategoryEntity = optional.get();
			CategoryDto categoryDto = categoryMapper.toDto(coursecategoryEntity);
			return categoryDto;
		} else {
			throw new RuntimeException("Course Category " + courseCategory + "is not present");
		}
	}

	public void deleteCategory(String courseCategory) {
		Optional<CourseCategoryEntity> optional = categoryRepository.findById(courseCategory);
		if (optional.isPresent()) {
			CourseCategoryEntity coursecategoryEntity = optional.get();
			CategoryDto categoryDto = categoryMapper.toDto(coursecategoryEntity);
			CourseCategoryEntity mappedEntity = categoryMapper.toEntity(categoryDto);
			categoryRepository.delete(mappedEntity);
		} else {
			System.out.println("Given Course ID is not present");
		}
	}

	public CategoryDto saveCategory(CategoryDto category) {
		CourseCategoryEntity categoryEntity = categoryMapper.toEntity(category);
		categoryRepository.save(categoryEntity);
		return category;
	}

	public CategoryDto updateCategory(CategoryDto categoryDto, String courseCategory) {

		CourseCategoryEntity coursecategoryEntity = categoryMapper.toEntity(categoryDto);

		Optional<CourseCategoryEntity> object = categoryRepository.findById(courseCategory);
		if (object.isPresent()) {
			categoryDto.setUpdatedOn(Timestamp.from(Instant.now()));
			categoryRepository.save(coursecategoryEntity);
			return categoryDto;
		} else {
			throw new EntityNotFoundException("Course category " + courseCategory + " is not found");
		}
	}

}
