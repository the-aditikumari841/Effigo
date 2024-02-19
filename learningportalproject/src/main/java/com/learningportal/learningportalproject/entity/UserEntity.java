package com.learningportal.learningportalproject.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_entity")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userID;

	@Column(name = "username")
	private String userName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	//@CreationTimestamp

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", nullable = false, updatable = false)
	private LocalDateTime createdOn;
	//@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_on", updatable = true)
	private LocalDateTime updatedOn;

	@Column(name = "password")
	private String password;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;

	@ManyToOne
	@JoinColumn(name = "fav_id")
	private FavEntity fav;

	//public void updateTimestamp() {
	//	this.updatedOn = LocalDateTime.now();

	//}

}
