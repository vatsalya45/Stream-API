package com.vatsalya.arrays;

import java.util.*;

public class UniqueNumbers {

	public static void main(String[] args) {
		
		Integer[] numbers = {1, 2, 3, 4, 9, 9, 6, 5, 2, 3, 6, 7, 8, 4};
		
		Object[] uniqueNumbers = Arrays.stream(numbers).distinct().toArray();
		
		System.out.println(Arrays.toString(uniqueNumbers));
	}

}
/* WAP to print all the unique numbers from the Array.

    Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
    Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8] */
