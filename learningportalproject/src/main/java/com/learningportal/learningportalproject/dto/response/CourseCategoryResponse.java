package com.learningportal.learningportalproject.dto.response;

import java.io.Serializable;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class CourseCategoryResponse implements Serializable {
	
	private String courseCategory ;
	

}


// category entity - courseCategory 

