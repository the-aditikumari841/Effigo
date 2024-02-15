package com.learningportal.learningportalproject.dto.response;

import java.io.Serializable;
import java.util.Date;

public class FavResponse implements Serializable {
	
	private String is_favourite;
	
	public FavResponse() {
		
	}
	
	public String getIsFav() {
		return is_favourite;
	}
	
	public void setIsFav(String isFav) {
		if(isFav.equalsIgnoreCase("true") || isFav.equalsIgnoreCase("false"))
			this.is_favourite = is_favourite;
		else
			this.is_favourite = is_favourite;

	}

}

// fav entity - fav ( true / false ) 

