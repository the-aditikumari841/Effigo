package com.learningportal.learningportalproject.service;

import java.util.List;
import java.util.Optional;

import com.learningportal.learningportalproject.entity.FavEntity;
import com.learningportal.learningportalproject.entity.UserEntity;


public interface FavService {
	List<FavEntity> findAllFav();
	Optional<FavEntity> findById(Long id);
	FavEntity saveCourseCategory(FavEntity favEntity);
	FavEntity updateCourseCategory(FavEntity favEntity);
	void deleteFav(Long id);
	FavEntity saveFav(FavEntity favEntity);
	FavEntity updateFav(FavEntity favEntity);
}




