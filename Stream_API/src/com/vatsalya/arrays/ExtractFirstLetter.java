package com.vatsalya.arrays;

import java.util.*;
public class ExtractFirstLetter {

	public static void main(String[] args) {
		String []names = {"James", "Aryan", "Vibha", "Aniket"};
		
		List<Character> list = Arrays.stream(names).map(n -> n.charAt(0)).toList();
		System.out.println(list);
		
		//OR
		
		Arrays.stream(names).map(n -> n.charAt(0)).forEach(System.out::print);
	}

}
/*   WAP to extract First Letter of Each Word from String Array

      String []names = {"James", "Aryan", "Vibha", "Aniket"};

      First Letters: [J, A, V, A] */