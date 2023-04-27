package com.bean.controller;
 
public class EmployeeB {
	private int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeB(int id, String name, String email, String department, String designation, int experience,
			int salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.designation = designation;
		this.experience = experience;
		this.salary = salary;
	}
	private String name;
    private String email;
    private String department;
    private String designation;
    private int experience;
    private int salary;
	public EmployeeB(String name, String email, String department, String designation, int experience, int salary) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.designation = designation;
		this.experience = experience;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    
	
	
	
	
}
