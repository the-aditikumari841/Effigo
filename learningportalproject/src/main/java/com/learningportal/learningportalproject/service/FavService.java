package com.learningportal.learningportalproject.service;

import java.util.List;
import java.util.Optional;

import com.learningportal.learningportalproject.entity.FavEntity;
import com.learningportal.learningportalproject.entity.UserEntity;

import jakarta.persistence.Column;


public interface FavService {
	List<FavEntity> findAllFav();
	Optional<FavEntity> findById(Long favID);
	FavEntity saveCourseCategory(FavEntity favEntity);
	FavEntity updateCourseCategory(FavEntity favEntity);
	void deleteFav(Long favID);
	FavEntity saveFav(FavEntity favEntity);
	FavEntity updateFav(FavEntity favEntity);
}




