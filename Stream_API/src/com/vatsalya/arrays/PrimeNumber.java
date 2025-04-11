package com.vatsalya.arrays;

import java.util.Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		Object[] primeArray = Arrays.stream(numbers).filter(PrimeNumber::isPrime).toArray();
		
		System.out.println(Arrays.toString(primeArray));
	}
	
	public static boolean isPrime(int num) {
		
		if(num < 2)
			return false;
		for(int i = 2; i<=Math.sqrt(num);i++) {
			
			if(num % i == 0)
				return false;
			
		}
		return true;
	}

}
/* WAP to print all the Prime Numbers from an Integer Array.

    Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    Output : Prime Numbers: [2, 3, 5, 7, 11]
 */