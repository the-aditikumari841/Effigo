package com.learningportal.learningportalproject.service;

import java.util.List;
import java.util.Optional;

import com.learningportal.learningportalproject.entity.FavEntity;


public interface FavService {
	List<FavEntity> findAllFav();
	Optional<FavEntity> findById(Long id);
	FavEntity saveCourseCategory(FavEntity favEntity);
	FavEntity updateCourseCategory(FavEntity favEntity);
	void deleteFav(Long id);
}




