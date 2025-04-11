package com.vatsalya.institute_management_system;

import java.util.*;
import java.util.stream.*;

public class StudentManagement {

	private static List<Student> students = new ArrayList<Student>();
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Student Management System:\r\n"
				+ "1. Add Student\r\n"
				+ "2. List All Students\r\n"
				+ "3. Sort Students by GPA\r\n"
				+ "4. Find Top GPA by Department\r\n"
				+ "5. Categorize and Print Top GPA\r\n"
				+ "6. Get Average GPA by Department\r\n"
				+ "7. Get Top N Experienced Students\r\n"
				+ "8. Get Gender Ratio by Department\r\n"
				+ "9. Filter Students by GPA\r\n"
				+ "10. Get Department with Highest Average GPA\r\n"
				+ "11. Find Students by Years of Study Range\r\n"
				+ "12. Find Students by Department and GPA\r\n"
				+ "13. Exit");
		
		
			int choice = Integer.parseInt(sc.nextLine());
		
			switch(choice) {
			
			case 1: 
				System.out.println("Enter the number of students you want to add");
				int n = Integer.parseInt(sc.nextLine());
				for(int i=0; i<n; i++ ) 
				{
					System.out.println("Enter the name of the student");
					String name = sc.nextLine();
		
					System.out.println("Enter the gender of the student");
					String gender = sc.nextLine();
		
					System.out.println("Enter the department of the student");
					String department = sc.nextLine();
		
					System.out.println("Enter the gpa of the student");
					double gpa = Double.parseDouble(sc.nextLine());
		
					System.out.println("Enter the years of study");
					int years_of_study = Integer.parseInt(sc.nextLine());
			
					addStudent(name, gender, department, gpa, years_of_study);
				}
				break;
		
			case 2: 
				listAllStudents();
			break;
			
			case 3:
				sortStudentsByGpa();
			break;
			
			case 4:
				findTopGpaByDepartment();
			break;	
			
			case 5:
				categorizeAndPrintTopGpa();
			break;
			
			case 6:
				getAverageGpaByDepartment();
			break;
			
			case 7:
				System.out.println("Enter the number of the students.");
				int n1 = Integer.parseInt(sc.nextLine());
				getTopNExperiencedStudents(n1);
			break;
			
			case 8:
				
			
		}
		}
	}
	
	private static void addStudent(String name, String gender, String department, double gpa, int years_of_study) {
		
		try {
			
			if(gpa < 0 && gpa > 10 && years_of_study <0 && years_of_study> 10) 
			{
				throw new IllegalArgumentException();
			}
			else {
				students.add(new Student(name,gender,department,gpa,years_of_study));
				System.out.println("Student added successfully");
			}
			
		}catch (IllegalArgumentException e) {
			
			System.out.println("Inavalid gpa or years value it must be b/w 0 - 10");
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void listAllStudents() {
				
		List<Student> list = students.stream().toList();		
		try {
			if(list.isEmpty()) {
				throw new NoSuchElementException("No student found");
			}
			else {
				list.forEach(System.out::println);
			}
		}catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void sortStudentsByGpa() {
		
		List<Student> l =  students.stream().sorted((g1,g2) ->g1.getGpa().compareTo(g2.getGpa())).toList();
		
		try {
			if(l.isEmpty()) {
				throw new NoSuchElementException("No student found");
			}
			else {
				l.forEach(System.out::println);
			}
		}catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void findTopGpaByDepartment() {
		
		Map<String, Optional<Student>> group = students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))));
		
		try {
		if(group.isEmpty()) {
			
			throw new NoSuchElementException("No Student found");
		}else
		group.forEach((dept,gpa) -> System.out.println("Department : "+dept+" | gpa : "+gpa));
		}
		catch (NoSuchElementException e) {
			
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void categorizeAndPrintTopGpa() {
		
		try {
			
			Map<String, Optional<Student>> byDept = students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))));
			
			
			Map<String, Optional<Student>> byGender = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))));
			
			if(byDept.isEmpty()) {
				throw new NoSuchElementException("No student found");
			}
			else {
				byDept.forEach((dept,gpa) -> System.out.println("Department : "+dept+" | gpa :  "+gpa));
			}
			if(byGender.isEmpty()) {
				throw new NoSuchElementException("No student found");
			}
			else {
				byDept.forEach((gen,gpa) -> System.out.println("Department : "+gen+" | gpa : "+gpa));
			}
			
		}catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	
	private static void getAverageGpaByDepartment() {
		
		try {
			Map<String, Double> avrg = students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getGpa)));
			
			if(avrg.isEmpty()) {
				throw new NoSuchElementException("No student found");
			}
			else {
				avrg.forEach((dept,gpa) -> System.out.println("Department : "+dept+" | gpa : "+gpa));
			}
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void getTopNExperiencedStudents(int n) {
		
		long count = students.stream().count();
		
		System.out.println(count);
	}
	
	
}
