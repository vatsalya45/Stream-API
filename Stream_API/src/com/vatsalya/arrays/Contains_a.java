package com.vatsalya.arrays;

import java.util.*;
//import java.util.stream.*;
public class Contains_a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = Integer.parseInt(sc.nextLine());
		String[] words = new String[a];
		
		for(int i = 0 ; i < a ; i++) {
			
			System.out.println("Enter the name");
			
			words[i] = sc.nextLine();
			
			
		}
		System.out.println(Arrays.toString(words));
		
		//In single line 
		Object[] array = Arrays.stream(words).filter(n-> n.contains("a")).toArray();
		
		//Multiline
//		Stream<String> strm = Arrays.stream(words);
//		Stream<String> filter = strm.filter(n-> n.contains("a"));
//		Object[] array = filter.toArray();
		System.out.println(Arrays.toString(array));
		sc.close();
	}

}
/* Q2) WAP to print all the names from String array which contains 
    letter 'a' in the name.

    String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
    Output : Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]
 */
