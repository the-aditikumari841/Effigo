package com.learningportal.learningportalproject.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "fav_entity")
public class FavEntity {

	@Id
	@Column(name = "fav_id")
	private long favID;

	@Column(name = "created_on", updatable = false)
	private Timestamp createdOn;

	@Column(name = "updated_on", updatable = true)
	private Timestamp updatedOn;

	@OneToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

}
