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
	@Column(name = "fav_id")
	private long favID;
	
	@Column(name = "created_on")
	private LocalDateTime  createdOn;
	
	@Column(name = "updated_on")
	private LocalDateTime updatedOn;
	
	@OneToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	
	
}







