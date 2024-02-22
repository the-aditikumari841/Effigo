package com.learningportal.learningportalproject.service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learningportal.learningportalproject.dto.UserDto;
import com.learningportal.learningportalproject.entity.UserEntity;
import com.learningportal.learningportalproject.mappers.UserMapper;
import com.learningportal.learningportalproject.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	public List<UserDto> findAllUsers() {
		List<UserEntity> userEntity = userRepository.findAll();
		List<UserDto> userDtos = userMapper.toDto(userEntity);
		return userDtos;
	}

	public UserDto findById(Long userID) {
		Optional<UserEntity> optional = userRepository.findById(userID);
		if (optional.isPresent()) {
			UserEntity userEntity = optional.get();
			UserDto userDto = userMapper.toDto(userEntity);
			return userDto;
		} else {
			throw new RuntimeException("User with user Id" + userID + "is not present");
		}
	}

	public void deleteUser(Long userID) {
		Optional<UserEntity> optional = userRepository.findById(userID);
		if (optional.isPresent()) {
			UserEntity userEntity = optional.get();
			UserDto userDto = userMapper.toDto(userEntity);
			UserEntity mappedEntity = userMapper.toEntity(userDto);
			userRepository.delete(mappedEntity);
		} else {
			System.out.println("Given Course ID is not present");
		}
	}

	public UserDto saveUser(UserDto user) {
		user.setCreatedOn(Timestamp.from(Instant.now()));
		UserEntity userEntity = userMapper.toEntity(user);
		userRepository.save(userEntity);
		return user;
	}

	public UserDto updateUser(UserDto userDto, Long id) {

		UserEntity userEntity = userMapper.toEntity(userDto);

		if (userRepository.existsById(id)) {
			userDto.setUpdatedOn(Timestamp.from(Instant.now()));
			userRepository.save(userEntity);
			return userDto;
		} else {
			throw new EntityNotFoundException("User not found with ID: " + id);
		}
	}

}
