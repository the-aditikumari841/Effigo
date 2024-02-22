package com.learningportal.learningportalproject.service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learningportal.learningportalproject.dto.CourseDto;
import com.learningportal.learningportalproject.entity.CourseEntity;
import com.learningportal.learningportalproject.mappers.CourseMapper;
import com.learningportal.learningportalproject.repository.CourseRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseMapper courseMapper;

	public List<CourseDto> findAllCourse() {
		List<CourseEntity> courseEntity = courseRepository.findAll();
		List<CourseDto> courseDtos = courseMapper.toDto(courseEntity);
		return courseDtos;
	}

	public CourseDto findById(Long courseID) {
		Optional<CourseEntity> optional = courseRepository.findById(courseID);
		if (optional.isPresent()) {
			CourseEntity courseEntity = optional.get();
			CourseDto courseDto = courseMapper.toDto(courseEntity);
			return courseDto;
		} else {
			throw new RuntimeException("Course Category " + courseID + "is not present");
		}
	}

	public void deleteCourse(Long courseID) {
		Optional<CourseEntity> optional = courseRepository.findById(courseID);
		if (optional.isPresent()) {
			CourseEntity courseEntity = optional.get();
			CourseDto courseDto = courseMapper.toDto(courseEntity);
			CourseEntity mappedEntity = courseMapper.toEntity(courseDto);
			courseRepository.delete(mappedEntity);
		} else {
			System.out.println("Given Course ID is not present");
		}
	}

	public CourseDto saveCourse(CourseDto course) {
		CourseEntity courseEntity = courseMapper.toEntity(course);
		courseRepository.save(courseEntity);
		return course;
	}

	public CourseDto updateCourse(CourseDto courseDto, Long id) {

		CourseEntity courseEntity = courseMapper.toEntity(courseDto);
		Optional<CourseEntity> optional = courseRepository.findById(id);
		if (optional.isPresent()) {
			courseDto.setUpdatedOn(Timestamp.from(Instant.now()));
			courseRepository.save(courseEntity);
			return courseDto;
		} else {
			throw new EntityNotFoundException("Course not found with ID: " + id);
		}
	}
}
