package com.learningportal.learningportalproject.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FavRequest implements Serializable {
	
	private long favID;
	private String is_favourite;
	private LocalDateTime  createdOn;
	private LocalDateTime updatedOn;
    
	// fav entity - fav ( true / false ) 
    

}

