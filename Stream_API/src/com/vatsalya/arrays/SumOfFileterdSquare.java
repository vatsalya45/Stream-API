package com.vatsalya.arrays;

import java.util.*;
public class SumOfFileterdSquare {

	public static void main(String[] args) {
		
		int[] arr = {-3, 2, -5, 6, -1, 4, 8, 9, 6};
		
		int sum = Arrays.stream(arr).filter(n -> n>=0).map(n -> n*n).sum();
		System.out.println(sum);
	}

}
/*  Write a Java program that reads an array of integers, filters out the negative numbers, and then calculates the sum of the squares of the remaining positive numbers using streams and the reduce method.

Input:
Input array: [-3, 2, -5, 6, -1, 4]
Output:
Sum of squares of positive numbers: 52 */