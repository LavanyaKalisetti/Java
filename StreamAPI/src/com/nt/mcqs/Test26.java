/*
 * Q26.What is the purpose of the collect() method in the Stream API?
  
 A) To transform the elements of a Stream.


 B) To filter the elements in a Stream based on a predicate.


 C) To perform a reduction operation on the Stream elements.


 D) To accumulate the elements of a Stream into a collection or a summary result.
 * 
 */


package com.nt.mcqs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test26 {
	public static void main(String args[]) {
		List<String> list = Stream.of("apple", "banana", "cherry")
		        .collect(Collectors.toList());

		System.out.println(list); // [apple, banana, cherry]

	}

}
/*
 Output: D) To accumulate the elements of a Stream into a collection or a summary result.

-The collect() method in the Stream API is a terminal operation that accumulates the elements of a Stream 
 into a collection, array, or other data structure. It can also be used to perform summary operations, such as calculating the average or sum of a Stream of numbers.

-The collect() method takes a Collector as an argument, 
 which defines how the elements should be accumulated. Some common use cases for collect() include:

- Accumulating elements into a collection, such as a List or Set
- Creating a Map from a Stream of key-value pairs
- Calculating summary statistics, such as the average or sum of a Stream of numbers

List<String> list = Stream.of("apple", "banana", "cherry")
        .collect(Collectors.toList());

System.out.println(list); // [apple, banana, cherry]

  */
 