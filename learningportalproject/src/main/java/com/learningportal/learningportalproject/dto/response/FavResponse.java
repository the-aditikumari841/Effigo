package com.learningportal.learningportalproject.dto.response;

import java.io.Serializable;

import java.util.Date;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor



public class FavResponse implements Serializable {
	
	private String fav_ID;
	


}

// fav entity - fav ( true / false ) 

