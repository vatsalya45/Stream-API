package com.vatsalya.arrays;

import java.util.*;
import java.util.stream.Stream;

public class GreaterThan3 {

	public static void main(String[] args) {
		
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky" };
		
		Stream<String> fil = Arrays.stream(words).filter(str -> str.length()>3);
		Object[] s = fil.toArray();
		System.out.println(Arrays.toString(s));
		
		//In One Line 
		
		Arrays.stream(words).filter(str-> str.length()>3).forEach(System.out::println);
	}

}
/* Q4) WAP to print all the names from String array where the length of the 
    name must be greater than 3.

    String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
    Output : [Rohit, Smirti, Richa] */