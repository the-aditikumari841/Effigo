package com.learningportal.learningportalproject.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import com.learningportal.learningportalproject.entity.FavEntity;
import com.learningportal.learningportalproject.service.FavService;
import com.learningportal.learningportalproject.entity.UserEntity;
import com.learningportal.learningportalproject.service.UserService;
import com.learningportal.learningportalproject.entity.CourseEntity;
import com.learningportal.learningportalproject.service.CourseService;



@RestController
@RequestMapping("/fav")
public class FavController {
	
	private FavService favService;
	
	public FavController(FavService favService) {
		this.favService = favService;
	}
	
	@GetMapping
	public List<FavEntity> findAllFav() {
		return favService.findAllFav();
	}
	
	@GetMapping("/{id}")
	public Optional<FavEntity> findFavById(@PathVariable("id") Long favID){
		return favService.findById(favID);
	}
	
	@PostMapping
	public FavEntity saveFav(@RequestBody FavEntity favEntity) {
		return favService.saveFav(favEntity);
	}
	
	@PutMapping
	public FavEntity updateFav(@RequestBody FavEntity favEntity) {
		return  favService.updateFav(favEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long favID) {
		favService.deleteFav(favID);
	}
}



