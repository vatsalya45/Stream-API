package com.vatsalya.arrays;

import java.util.Arrays;
import java.util.stream.*;
public class RemoveNegativeNumbers {

	public static void main(String[] args) {
	
	    Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
	    Stream<Integer> nonNegative = Arrays.asList(numbers).stream().filter(num -> num>=0);
	    Object[] array = nonNegative.toArray();
	    
	    System.out.println("Positive Numbers : "+Arrays.toString(array));
	    
	    System.out.println(anotherWay(numbers));
	}
	
	public static String anotherWay(Integer[] arr) {
		
		Stream<Integer> stream = Arrays.stream(arr);
		Object[] array =stream.filter(num -> num>=0).toArray();
		return  Arrays.toString(array);
		
	}

}
/* Q1) WAP to remove Negative Numbers from an Integer Array.

    Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
   
    Output : Positive Numbers: [5, 10, 15]
    
     */