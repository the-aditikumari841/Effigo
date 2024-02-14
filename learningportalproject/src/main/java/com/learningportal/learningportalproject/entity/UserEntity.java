package com.learningportal.learningportalproject.entity;

import java.sql.Date;
import jakarta.persistence.*;

@Entity
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
	
	@Column(name = "password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;
	
	public UserEntity()
	{
		
	}
	
	// user entity - userID , userName , gender , dateOFBirth , password
	
	public UserEntity(Long userID, String userName, String gender, Date dateOfBirth , String password ) {
		this.userID = userID;
		this.userName = userName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth ;
		this.password = password ;
	}

	public long getuserID() {
		return userID;
	}

	public void setuserID(long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}




