package com.learningportal.learningportalproject.dto.mapper;

import com.learningportal.learningportalproject.dto.request.CourseCategoryRequest;
import com.learningportal.learningportalproject.dto.response.CourseCategoryResponse;
import com.learningportal.learningportalproject.entity.CourseCategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CourseCategoryMapper {

	
CourseCategoryMapper MAPPER = Mappers.getMapper(CourseCategoryMapper.class);
CourseCategoryEntity fromRequestToEntity(CourseCategoryRequest coursecategoryRequest);
CourseCategoryResponse fromEntityToResponse(CourseCategoryEntity coursecategoryEntity);
	
}

