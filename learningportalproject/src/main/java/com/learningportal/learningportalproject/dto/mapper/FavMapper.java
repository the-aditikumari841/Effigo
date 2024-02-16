package com.learningportal.learningportalproject.dto.mapper;

import com.learningportal.learningportalproject.dto.request.FavRequest;
import com.learningportal.learningportalproject.dto.response.FavResponse;
import com.learningportal.learningportalproject.entity.FavEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface FavMapper {

	
FavMapper MAPPER = Mappers.getMapper(FavMapper.class);
FavEntity fromRequestToEntity(FavRequest favRequest);
FavResponse fromEntityToResponse(FavEntity favEntity);
	
}

