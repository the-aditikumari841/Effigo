package com.learningportal.learningportalproject.service;

import java.util.List;
import java.util.Optional;

import com.learningportal.learningportalproject.entity.UserEntity;


public interface UserService {
	List<UserEntity> findAllUser();
	Optional<UserEntity> findById(Long userID);
	UserEntity saveUser(UserEntity userEntity);
	UserEntity updateUser(UserEntity userEntity);
	void deleteUser(Long userID);
}




