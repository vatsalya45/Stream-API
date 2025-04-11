package com.vatsalya.arrays;

import java.util.*;

public class BooleanToYesOrNo {

	public static void main(String[] args) {
		Boolean[] flags = {true, false, true, false, true};
		
		List<String> list = Arrays.stream(flags).map(n -> n?"Yes":"No").toList();
		System.out.println(list);
	}

}
/*  WAP to convert boolean value to "Yes" or "No"

    Boolean[] flags = {true, false, true, false, true};

    Yes/No Values: [Yes, No, Yes, No, Yes] */