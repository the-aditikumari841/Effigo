package com.learningportal.learningportalproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningportal.learningportalproject.entity.UserEntity;
import com.learningportal.learningportalproject.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<UserEntity> findAllUser() {
		return userService.findAllUser();
	}

	@GetMapping("/{id}")
	public Optional<UserEntity> findUserById(@PathVariable("id") Long userID) {
		return userService.findById(userID);
	}

	@PostMapping()
	public UserEntity saveUser(@RequestBody UserEntity userEntity) {
		//@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime createdOn ,
		//@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime updatedOn) {
		// Your logic to create event
		return userService.saveUser(userEntity);
	}

	@PutMapping
	public UserEntity updateUser(@RequestBody UserEntity userEntity) {
		return userService.updateUser(userEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long userID) {
		userService.deleteUser(userID);
	}
}
