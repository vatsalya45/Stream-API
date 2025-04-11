package com.vatsalya.collections;

import java.util.List;
import java.util.function.Predicate;

public class StartWithVowel {

	public static void main(String[] args) {
		
		Predicate<String> s1=str->{
//			String nstr = str;
//			char ch=str.toLowerCase().charAt(0);
//			return  str.length()>5 && nstr.indexOf(ch);
			
			//Second way
			if(str.length()>5) {
				if(!(str.startsWith("a")||str.startsWith("e")||str.startsWith("i")||str.startsWith("o")||str.startsWith("u")) ){
					return true;
				}
			}
			return false;
		};
		
		List<String> alpha = List.of("abcdef","ghijkl","mnop","qrs","tuvwxyz");
		
		List<String> list = alpha.stream().filter(s1).toList();
		System.out.println(list);
	}

}
/* Q1) 
Write a program to process a list of strings. Use a custom predicate to filter strings that start with a vowel and have a length greater than 5.
 */