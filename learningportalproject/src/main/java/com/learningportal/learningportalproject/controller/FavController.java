package com.learningportal.learningportalproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningportal.learningportalproject.dto.FavDto;
import com.learningportal.learningportalproject.service.FavService;

@RestController
@RequestMapping("/fav")
public class FavController {

	@Autowired
	private FavService favService;

	private static final Logger log = LoggerFactory.getLogger(FavController.class);

	@GetMapping(value = "/getAllCategories", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FavDto> findAllFav() {

		log.info("List of Fav:");
		List<FavDto> data = favService.findAllFav();
		return data;
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public FavDto findFavById(@PathVariable Long id) {
		return favService.findById(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FavDto saveFav(@RequestBody FavDto favDto) {
		return favService.saveFav(favDto);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteFav(@PathVariable Long id) {
		favService.deleteFav(id);
	}

}
