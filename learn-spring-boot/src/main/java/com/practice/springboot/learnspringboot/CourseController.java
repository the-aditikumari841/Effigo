package com.practice.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn SpringBoot" , "eclipse"),
				new Course(2, "Learn SpringBoot" , "eclipse"),
				new Course(3, "Learn SpringBoot" , "eclipse"),
				new Course(4, "Learn SpringBoot" , "eclipse")
				);
	}

}

