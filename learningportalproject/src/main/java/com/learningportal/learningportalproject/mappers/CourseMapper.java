package com.learningportal.learningportalproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.learningportal.learningportalproject.dto.CourseDto;
import com.learningportal.learningportalproject.entity.CourseEntity;

@Mapper(componentModel = "spring")
public interface CourseMapper extends EntityMapper<CourseDto, CourseEntity> {
	CourseDto toDto(CourseEntity entity);

	CourseEntity toEntity(CourseDto dto);

	List<CourseDto> toDto(List<CourseEntity> entitylist);

	List<CourseEntity> toEntity(List<CourseDto> dtolist);

}