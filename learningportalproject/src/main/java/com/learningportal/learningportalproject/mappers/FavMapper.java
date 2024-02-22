package com.learningportal.learningportalproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.learningportal.learningportalproject.dto.FavDto;
import com.learningportal.learningportalproject.entity.FavEntity;

@Mapper(componentModel = "spring")
public interface FavMapper extends EntityMapper<FavDto, FavEntity> {
	FavDto toDto(FavEntity entity);

	FavEntity toEntity(FavDto dto);

	List<FavDto> toDto(List<FavEntity> entitylist);

	List<FavEntity> toEntity(List<FavDto> dtolist);
}