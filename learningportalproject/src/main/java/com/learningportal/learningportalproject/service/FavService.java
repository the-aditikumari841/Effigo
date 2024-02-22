package com.learningportal.learningportalproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learningportal.learningportalproject.dto.FavDto;
import com.learningportal.learningportalproject.entity.FavEntity;
import com.learningportal.learningportalproject.mappers.FavMapper;
import com.learningportal.learningportalproject.repository.FavRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FavService {

	@Autowired
	private FavRepository favRepository;

	@Autowired
	private FavMapper favMapper;

	public List<FavDto> findAllFav() {
		List<FavEntity> favEntity = favRepository.findAll();
		List<FavDto> favDtos = favMapper.toDto(favEntity);
		return favDtos;
	}

	public FavDto findById(Long favID) {
		Optional<FavEntity> optional = favRepository.findById(favID);
		if (optional.isPresent()) {
			FavEntity favEntity = optional.get();
			FavDto favDto = favMapper.toDto(favEntity);
			return favDto;
		} else {
			throw new RuntimeException("Favourite with fav Id" + favID + "is not present");
		}
	}

	public void deleteFav(Long favID) {
		Optional<FavEntity> optional = favRepository.findById(favID);
		if (optional.isPresent()) {
			FavEntity favEntity = optional.get();
			FavDto favDto = favMapper.toDto(favEntity);
			FavEntity mappedEntity = favMapper.toEntity(favDto);
			favRepository.delete(mappedEntity);
		} else {
			System.out.println("Given Fav ID is not present");
		}

	}

	public FavDto saveFav(FavDto fav) {
		FavEntity favEntity = favMapper.toEntity(fav);
		favRepository.save(favEntity);
		return fav;
	}

}
