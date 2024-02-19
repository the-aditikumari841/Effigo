package com.learningportal.learningportalproject.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningportal.learningportalproject.entity.FavEntity;
import com.learningportal.learningportalproject.repository.FavRepository;
import com.learningportal.learningportalproject.service.FavService;

@Service
public class FavServiceImpl implements FavService {
	@Autowired
	private FavRepository favRepository;

	public FavServiceImpl(FavRepository favRepository) {
		this.favRepository = favRepository;
	}

	public List<FavEntity> findAllFav() {
		return favRepository.findAll();
	}

	public Optional<FavEntity> findById(Long favID) {
		return favRepository.findById(favID);
	}

	public void deleteFav(Long favID) {
		favRepository.deleteById(favID);
	}

	public FavEntity saveFav(FavEntity fav) {
		fav.setUpdatedOn(LocalDateTime.now());
		fav.setUpdatedOn(LocalDateTime.now());
		return null;
	}

	public FavEntity updateFav(FavEntity fav) {
		fav.setUpdatedOn(LocalDateTime.now());
		return null;
	}

}
