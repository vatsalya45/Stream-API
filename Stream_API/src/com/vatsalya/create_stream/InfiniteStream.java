package com.vatsalya.create_stream;

import java.util.List;
import java.util.stream.*;
public class InfiniteStream {

	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.generate(() -> (int)(Math.random() * 100));
		List<Integer> c1= stream1.map(n -> n*n).filter(n -> n%2==1).limit(10).collect(Collectors.toList());
		System.out.println(c1);
	}

	public static List<Integer> UsingIterator(List<Integer> list){
		
		
		return null;
	}
}
/**
  * Use Stream.iterate or Stream.generate to create an 
  * infinite stream. Then filter and map the data to produce the first 10 odd squares.
 */
