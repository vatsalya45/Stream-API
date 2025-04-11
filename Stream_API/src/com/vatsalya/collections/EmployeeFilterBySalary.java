package com.vatsalya.collections;

import java.util.*;

record Employee(String name, String Id, Double salary) {
	
}
public class EmployeeFilterBySalary {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Manish","L009", 29000D));
		employeeList.add(new Employee("Kriti","I007", 89000D));
		employeeList.add(new Employee("Chaitanya","P019", 19000D));
		employeeList.add(new Employee("Umesh","K098", 99000D));
		employeeList.add(new Employee("Vinay","L011", 69000D));
		
		//employeeList.stream().filter(n -> n.salary()>30000).forEach(System.out::println);
		employeeList.stream().sorted((n1,n2)-> n1.salary().compareTo(n2.salary())).forEach(System.out::println);
	}

}
/** Create a record of Employee with attributes name:(String) and id:(String)
Given a list of Employee objects with name and 
salary properties, write a program to filter the list of Employees 
by salary in who are having salary > 30000 and print the employee names. **/