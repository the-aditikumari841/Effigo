package com.learningportal.learningportalproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.learningportal.learningportalproject.dto.CategoryDto;
import com.learningportal.learningportalproject.entity.CourseCategoryEntity;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDto, CourseCategoryEntity> {
	CategoryDto toDto(CourseCategoryEntity entity);

	CourseCategoryEntity toEntity(CategoryDto dto);

	List<CategoryDto> toDto(List<CourseCategoryEntity> entitylist);

	List<CourseCategoryEntity> toEntity(List<CategoryDto> dtolist);

}