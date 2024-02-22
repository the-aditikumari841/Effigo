package com.learningportal.learningportalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningportal.learningportalproject.dto.UserDto;
import com.learningportal.learningportalproject.service.UserService;

@RestController
@RequestMapping("/users")

public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/getAllCategories", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDto> findAllUsers() {
		List<UserDto> data = userService.findAllUsers();
		return data;
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDto findUserById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDto saveUser(@RequestBody UserDto userDto) {
		return userService.saveUser(userDto);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDto updateUser(@RequestBody UserDto updatedUser, Long userID) {
		return userService.updateUser(updatedUser, userID);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

}
