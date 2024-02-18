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
@Table(name = "course_entity")
public class CourseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private long courseID;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "course_cost")
	private int courseCost;
	
	@Column(name = "course_rating")
	private int courseRating;
	
	@Column(name = "created_on")
	private LocalDateTime createdOn;
	
	@Column(name = "updated_on")
	private LocalDateTime updatedOn;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@ManyToOne
	@JoinColumn(name = "course_category")
	private CourseCategoryEntity category;
	
	@OneToOne
	@JoinColumn(name = "is_favourite")
	private FavEntity favorite;



}




