package com.learningportal.learningportalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningportal.learningportalproject.entity.CourseEntity;


@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

}
