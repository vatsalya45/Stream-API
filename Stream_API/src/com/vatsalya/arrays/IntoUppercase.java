package com.vatsalya.arrays;

import java.util.*;
public class IntoUppercase {

	public static void main(String[] args) {
		String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
		
		List<String> list = Arrays.stream(names).map(n -> n.toUpperCase()).toList();
		System.out.println(list);
	}
	

}
/*  WAP to convert all the names of String array into uppercase 

    String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};

    Output : [VIRAT, SANJU, ROHIT, BUMRAH]
 */