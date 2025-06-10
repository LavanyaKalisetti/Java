/*
   Q5.Which method is used to create a Stream from a collection in Java 8?
  
   A) getStream()
   B) parallelStream()
   c) stream()
   D) createStream()
 */

package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test5 {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("apple", "banana", "cherry");
		Stream<String> stream = list.stream();
		System.out.println(list); //[apple, banana, cherry]
	}

}

/*
 * Output: C) stream().

Explanation:
In Java 8, you can create a Stream from a Collection 
using the stream() method. 
The stream() method returns a sequential Stream with the collection as its source.

The other options are not correct:

- getStream() is not a standard method for creating a Stream from a Collection.
- parallelStream() creates a parallel Stream, which can be used for parallel processing.
- createStream() is not a standard method for creating a Stream from a Collection.

You can use stream() to create a Stream and perform various operations, such as 
filtering, mapping, and reducing, on the elements of the Collection.
 */