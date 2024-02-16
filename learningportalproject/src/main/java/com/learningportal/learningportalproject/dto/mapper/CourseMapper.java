package com.learningportal.learningportalproject.dto.mapper;

import com.learningportal.learningportalproject.dto.request.CourseRequest;
import com.learningportal.learningportalproject.dto.response.CourseResponse;
import com.learningportal.learningportalproject.entity.CourseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CourseMapper {

	
CourseMapper MAPPER = Mappers.getMapper(CourseMapper.class);
CourseEntity fromRequestToEntity(CourseRequest courseRequest);
CourseResponse fromEntityToResponse(CourseEntity courseEntity);
	
}

