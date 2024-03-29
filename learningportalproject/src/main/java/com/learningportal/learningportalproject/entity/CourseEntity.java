package com.learningportal.learningportalproject.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

	@Column(name = "created_on", updatable = false)
	private Timestamp createdOn;

	@Column(name = "updated_on", updatable = true)
	private Timestamp updatedOn;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name = "category")
	private CourseCategoryEntity category;

	@OneToOne
	@JoinColumn(name = "favourite")
	private FavEntity favorite;

}
