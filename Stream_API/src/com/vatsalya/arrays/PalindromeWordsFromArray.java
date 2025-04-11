package com.vatsalya.arrays;

import java.util.*;

public class PalindromeWordsFromArray {

	public static void main(String[] args) {
		
		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
		
		Object[] array = Arrays.stream(words)
							  .filter(PalindromeWordsFromArray::isPalindrome)
							.toArray();
		
		System.out.println(Arrays.toString(array));
	}
	
	public static boolean isPalindrome(String str) {
		
		String nstr = str;
		String rev = "";
		int len = str.length();
		for(int i = 0 ; i<len;i++) {
			
			rev = str.charAt(i)+rev;
		}
		
		return (rev.equals(nstr)?true:false);
	}

}
/* WAP to filter Palindrome Words from an Array.

String[] words = {"madam", "hello", "racecar", "java", "level", "world"};

Output : Palindrome Words: [madam, racecar, level]
 */