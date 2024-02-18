package com.learningportal.learningportalproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningportal.learningportalproject.entity.CourseCategoryEntity;

@Repository
public interface CourseCategoryRepository extends JpaRepository<CourseCategoryEntity, String> {

	void deleteByCourseCategory(String courseCategory);

	Optional<CourseCategoryEntity> findByCourseCategory(String courseCategory);

}
