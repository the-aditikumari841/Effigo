package com.developer.employeemanagement.entity;

import java.sql.Date;

@Entity
@Table(name = "mt_employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = 1)
	private long id;
	private String name;
	private String gender;
	private Date dateOfBirth;
	private String address;
	
	public EmployeeEntity()
	{
		
	}
	
	public EmployeeEntity(Long id, String name, String gender, Date dateOfBirth , String address ) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth ;
		this.address = address ;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
