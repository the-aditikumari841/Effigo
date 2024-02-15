package com.learningportal.learningportalproject.dto.response;

import java.io.Serializable;
import java.util.Date;


public class UserResponse implements Serializable {
	
	private Long userID ;
	private String userName ;
	private String gender ;
	private Date dateOfBirth ;
	private String password ;
	
	public UserResponse() {
		
	}
	
	public Long getId() {
		return userID;
	}
	
	public void setID(Long userID) {
		this.userID = userID;
	}
	
	public String getName() {
		return userName;
	}
	
	public void setName(String userName) {
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
	
	public void getPassword(String password)
	{
		this.password = password;
	}	
}


//user entity - userID , userName , gender , dateOFBirth , password

