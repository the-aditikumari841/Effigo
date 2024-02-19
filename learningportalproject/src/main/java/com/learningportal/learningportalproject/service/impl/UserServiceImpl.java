package com.learningportal.learningportalproject.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningportal.learningportalproject.entity.UserEntity;
import com.learningportal.learningportalproject.repository.UserRepository;
import com.learningportal.learningportalproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	public List<UserEntity> findAllUser() {
		return userRepository.findAll();
	}

	public Optional<UserEntity> findById(Long userID) {
		return userRepository.findById(userID);
	}

	public UserEntity saveUser(UserEntity user) {
		user.setCreatedOn(LocalDateTime.now());
		user.setUpdatedOn(LocalDateTime.now());
		return userRepository.save(user);
	}

	public UserEntity updateUser(UserEntity user) {
		user.setUpdatedOn(LocalDateTime.now());
		return userRepository.save(user);
	}

	public void deleteUser(Long userID) {
		userRepository.deleteById(userID);
	}

}
