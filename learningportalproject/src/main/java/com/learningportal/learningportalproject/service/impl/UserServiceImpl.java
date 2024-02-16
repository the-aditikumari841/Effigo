package com.learningportal.learningportalproject.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.learningportal.learningportalproject.entity.UserEntity;
import com.learningportal.learningportalproject.repository.UserRepository;
import com.learningportal.learningportalproject.service.UserService;





@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<UserEntity> findAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<UserEntity> findById(Long userID) {
		// TODO Auto-generated method stub
		return userRepository.findById(userID);
	}

	@Override
	public UserEntity saveUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return userRepository.save(userEntity);
	}

	@Override
	public UserEntity updateUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return userRepository.save(userEntity);
	}

	@Override
	public void deleteUser(Long userID) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userID);
	}
}




