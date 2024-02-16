package com.learningportal.learningportalproject.dto.mapper;

import com.learningportal.learningportalproject.dto.request.UserRequest;
import com.learningportal.learningportalproject.dto.response.UserResponse;
import com.learningportal.learningportalproject.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
UserEntity fromRequestToEntity(UserRequest userRequest);
UserResponse fromEntityToResponse(UserEntity userEntity);
	
}



