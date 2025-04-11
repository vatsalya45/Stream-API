package com.vatsalya.institute_management_system;

public class Student {

	private String name;
	private String gender;
	private String department;
	private Double gpa;
	private Integer years_of_study;
	
	public Student(String name, String gender, String department, Double gpa, Integer years_of_study) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.gpa = gpa;
		this.years_of_study = years_of_study;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public Integer getYears_of_study() {
		return years_of_study;
	}

	public void setYears_of_study(Integer years_of_study) {
		this.years_of_study = years_of_study;
	}

	
	

//	@Override
//	public String toString() {
//		return "Student [name=" +name+" gender= "+gender+" department= "+department+" gpa= "+gpa+" years_of_study= "+years_of_study+"]";
//	}

	
	
	
	
}
