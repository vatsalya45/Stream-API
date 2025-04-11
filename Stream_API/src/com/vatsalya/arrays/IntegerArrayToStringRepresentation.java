package com.vatsalya.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class IntegerArrayToStringRepresentation {

	public static void main(String[] args) {
		
		Integer[] numbers = {10, 20, 30, 40, 50};
		
		Arrays.stream(numbers).map(n->"Number: "+n).forEach(System.out::println);
		
		List<String> c = Arrays.stream(numbers)
							.map(n->"Number: "+n)
						   .collect(Collectors.toList());
		
		System.out.println(c);
		
	}

}
/* WAP to convert Integer Array to String Representation

    Integer[] numbers = {10, 20, 30, 40, 50};
    Converted Strings: [Number: 10, Number: 20, Number: 30, Number: 40, Number: 50] */