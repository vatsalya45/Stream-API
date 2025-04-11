package com.vatsalya.collections;

import java.util.*;

public class LengthGreaterThan4 {

	public static void main(String[] args) {
		
		List<String> names = List.of("Toby", "Anna", "Leroy", "Alex","Roy");
		
		//names.add("jkl");
		//You can not add to the list it is an immutable collection
		
		System.out.println(names);
		
		names.stream().filter(n -> n.length()==4).sorted().limit(2).forEach(System.out::println);
		
	}

}
/*  Write a Java program that processes a list of names to filter, sort, and print names with a length of exactly 4 characters.
Requirements:
Use a list of strings containing names as input.
Filter out names that are not exactly 4 characters long.
Sort the filtered names in lexicographical order (alphabetical order).
Limit the output to the first 2 names after sorting.
Print each name on a new line.

Input : 
A List of strings: ["Toby", "Anna", "Leroy", "Alex"]
Expected Output:
Anna
Alex */