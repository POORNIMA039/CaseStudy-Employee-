package com.ntt.model;

public class Employee {
	private int employeeId;
	private int experience;
	private String employeeName;
	private String employeeAddress;
	private String dateOfJoining;
	private String dateOfBirth;

	// constructor using all the fields
	public Employee(int employeeId, int experience, String employeeName, String employeeAddress,
			String dateOfJoining, String dateOfBirth) {
		this.employeeId = employeeId;
		this.experience = experience;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth = dateOfBirth;
	}

	// zero parameterized constructor
	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



}
