package com.learningportal.learningportalproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningportal.learningportalproject.entity.FavEntity;
import com.learningportal.learningportalproject.service.FavService;

@RestController
@RequestMapping("/fav")
public class FavController {
	@Autowired
	private FavService favService;

	@GetMapping
	public List<FavEntity> findAllFav() {
		return favService.findAllFav();
	}

	@GetMapping("/{id}")
	public Optional<FavEntity> findFavById(@PathVariable("id") Long favID) {
		return favService.findById(favID);
	}

	@PostMapping
	public FavEntity saveFav(@RequestBody FavEntity favEntity) {
		return favService.saveFav(favEntity);
	}

	@PutMapping
	public FavEntity updateFav(@RequestBody FavEntity favEntity) {
		return favService.updateFav(favEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long favID) {
		favService.deleteFav(favID);
	}
}
