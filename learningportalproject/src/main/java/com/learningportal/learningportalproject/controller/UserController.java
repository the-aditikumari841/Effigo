package com.learningportal.learningportalproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import com.learningportal.learningportalproject.entity.UserEntity;
import com.learningportal.learningportalproject.service.UserService;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;


@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<UserEntity> findAllUser() {
		return userService.findAllUser();
	}
	
	@GetMapping("/{id}")
	public Optional<UserEntity> findUserById(@PathVariable("id") Long userID){
		return userService.findById(userID);
	}
	
	
	 @PostMapping()
	    public UserEntity saveUser(@RequestBody UserEntity userEntity,
	    	@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime createdOn ,
	        @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime updatedOn) {
	        // Your logic to create event
	        return userService.saveUser(userEntity);
    }
	
	
	@PutMapping
	public UserEntity updateUser(@RequestBody UserEntity userEntity) {
		return  userService.updateUser(userEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long userID) {
		userService.deleteUser(userID);
	}
}


