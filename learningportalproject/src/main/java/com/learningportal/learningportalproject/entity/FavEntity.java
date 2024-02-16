package com.learningportal.learningportalproject.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fav_entity")
public class FavEntity {

	@Id
	@Column(name = "is_favourite")
	private String is_favourite;
	
	@Column(name = "created_on")
	private LocalDateTime  createdOn;
	
	@Column(name = "updated_on")
	private LocalDateTime updatedOn;
	
	@OneToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;
	
	
	// fav entity - fav ( true / false ) 
	
	/*
	public FavEntity( String is_favourite ) {
		this.is_favourite = is_favourite;
	}

	public String getIsFavourite() {
		return is_favourite;
	}

	public void setIsFavourite(String is_favourite) {
		if( ( is_favourite.equalsIgnoreCase("true") ) || ( is_favourite.equalsIgnoreCase("false") ) )
			this.is_favourite = is_favourite;
		else
			this.is_favourite = "false";
	} */	
}







