
//public class UserMapper {
//
//	
//	
//	
//	
//
//UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
//UserEntity fromRequestToEntity(UserRequest userRequest);
//UserResponse fromEntityToResponse(UserEntity userEntity);
//	
//}

package com.learningportal.learningportalproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.learningportal.learningportalproject.dto.UserDto;
import com.learningportal.learningportalproject.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDto, UserEntity> {
	UserDto toDto(UserEntity entity);

	UserEntity toEntity(UserDto dto);

	List<UserDto> toDto(List<UserEntity> entitylist);

	List<UserEntity> toEntity(List<UserDto> dtolist);

}