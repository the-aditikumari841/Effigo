package com.learningportal.learningportalproject.service.impl;


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

	@Override
	public List<FavEntity> findAllFav() {
		// TODO Auto-generated method stub
		return favRepository.findAll();
	}

	@Override
	public Optional<FavEntity> findById(Long favID) {
		// TODO Auto-generated method stub
		return favRepository.findById(favID);
	}



	@Override
	public void deleteFav(Long favID) {
		// TODO Auto-generated method stub
		favRepository.deleteById(favID);
	}

	@Override
	public FavEntity saveFav(FavEntity favEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FavEntity updateFav(FavEntity favEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	
}



	
	
	
