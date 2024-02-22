package com.learningportal.learningportalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.learningportal.learningportalproject.mappers",
		"com.learningportal.learningportalproject.controller", "com.learningportal.learningportalproject.service" })
@EnableJpaRepositories(basePackages = { "com.learningportal.learningportalproject.repository" })
public class LearningportalprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningportalprojectApplication.class, args);
	}

}

//relationships among entities
//one to one
//one to many
//many to many

//steps for creating an application
//create database and connect to db
// create entity and auto create table to db
//create repository
//create service and service implementer
//create controller
//test api in postman
