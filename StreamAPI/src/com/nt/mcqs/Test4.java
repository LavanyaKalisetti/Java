/*
 Q4.What is the purpose of the `peek` method in the Stream API?

 A) It is used to modify the elements of the stream


 B) It is used to perform an action without interfering with the elements


 C) It is used to skip elements in the stream


 D) It is used to concatenate streams

 */

package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		List<String> Ex=names.stream()
		     .peek(System.out::println) // prints each element
		     .filter(name -> name.startsWith("A"))
		     .collect(Collectors.toList());
		System.out.println();
		System.out.println(Ex);

	}

}

/*
  Output: 
  B) It is used to perform an action without interfering with the elements
  
  Explanation:
  The "peek" method in the Java Stream API is an intermediate 
  operation used mainly for debugging purposes or performing actions 
  on each element without modifying the stream.
  -It does not alter the stream elements.
  -It’s commonly used to log or inspect the elements as they flow through the pipeline.
 */
