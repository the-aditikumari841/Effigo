package com.learningportal.learningportalproject.dto.response;

import java.io.Serializable;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FavResponse implements Serializable {
	@Id
	private String fav_ID;

}


