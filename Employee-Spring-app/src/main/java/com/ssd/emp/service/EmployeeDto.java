package com.ssd.emp.service;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.validation.constraints.NotBlank;



public class EmployeeDto {
	
	
	 @NotBlank(message = "first name is required")
	private String firstName;
	@NotBlank(message = "last name is required")
	private String lastName;
	@NotBlank(message = "Email is required")
	private String email;
	@NotBlank(message = "Phone no is required")
	private String phoneNo;
	@NotBlank(message = "Date of joining is required")
	private Date doj;
	@NotBlank(message = "sal is required")
	private Double sal;
	public EmployeeDto(@NotBlank(message = "first name is required") String firstName,
			@NotBlank(message = "last name is required") String lastName,
			@NotBlank(message = "Email is required") String email,
			@NotBlank(message = "Phone no is required") String phoneNo,
			@NotBlank(message = "Date of joining is required") Date doj,
			@NotBlank(message = "sal is required") Double sal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.doj = doj;
		this.sal = sal;
	}
	public EmployeeDto() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNo="
				+ phoneNo + ", doj=" + doj + ", sal=" + sal + "]";
	}
	
	

}
