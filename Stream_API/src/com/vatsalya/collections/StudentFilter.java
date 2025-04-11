package com.vatsalya.collections;


import java.util.*;

record Student (String name, String course){
	
	
}

public class StudentFilter {

	public static void main(String[] args) {
		
		List<Student> students =  new ArrayList<Student>();
		students.add(new Student("Alice", "Java"));
		students.add(new Student("Bob", "Pyhton"));
		students.add(new Student("David", "C++"));
		students.add(new Student("Eve", "ReactJs"));
		students.add(new Student("Charlie", "Java"));
		
		students.stream().filter(s -> s.course().equals("Java")).map(st-> st.name()).forEach(System.out::println);
	
		
	}

}
/* Question: You have a Student record with the following fields:
name : (String)
course : (String)

Create a ELC class StudentFilter.
Given a list of Student objects, where each student is enrolled in different courses, write a Java program to filter out the students who are enrolled in the "Java" course and print their names using the forEach method and the stream API.

Test Case 1:
Input:
List<Student> students =  [("Alice", "Java"),
   ("Bob", "Python"),
   ("Charlie", "Java"),
   ("David", "C++"),
   ("Eve", "JavaScript")]
Expected Output:
Alice
Charlie

Test Case 2:
Input:
List<Student> students = [("Alice", "Python"),
    ("Bob", "Python"),
    ("Charlie", "Python"),
    ("David", "C++"),
   ("Eve", "JavaScript")]
Expected Output:

Test Case 3:
Input:
List<Student> students = [
    ("Alice", "Java"),
    ("Bob", "Java"),
    ("Charlie", "Java"),
    ("David", "Java"),
    ("Eve", "Java")]
Expected Output:
Alice
Bob
Charlie
David
Eve
 */