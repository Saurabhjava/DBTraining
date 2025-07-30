package com.cg.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeDto {
	private int empid;
	@NotNull(message = "Name should not be null")
	@NotBlank(message = "Name can not be blank")
	private String name;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate dob;
	private double salary;
	@Email(message = "Invalid Email")
	private String email;
	
	
	public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeDto(int empid,String name,LocalDate dob, double salary, String email) {
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.email = email;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
