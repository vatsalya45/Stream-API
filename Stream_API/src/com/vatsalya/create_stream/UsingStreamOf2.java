package com.vatsalya.create_stream;


import java.util.stream.*;
public class UsingStreamOf2 {

	public static void main(String[] args) {
		
		Stream<String> f2 = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
		f2.filter(str-> !str.isEmpty()).forEach(System.out::print);
		
	}

}
/* Ques - 2
-----------
Write a Java program that uses the Stream.of method to create a stream of strings, filters out the empty strings, and then concatenate the remaining strings into a single string..

Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Output:
A single concatenated string:
HelloWorld from Java! */