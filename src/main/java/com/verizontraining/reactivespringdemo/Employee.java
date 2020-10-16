package com.verizontraining.reactivespringdemo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("employee")
public class Employee {
	private String name;
	private String city;
	private String employeeId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}
