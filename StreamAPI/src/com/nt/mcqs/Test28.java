/*
 Q28.Which is the new method introduced in java 8 to iterate over a collection?

 a) for (String i : StringList)


 b) foreach (String i : StringList)


 c) stringList.forEach()


 d) List.for()

 */


package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;

public class Test28 {
	public static void main(String args[]) {
		List<String> stringList = Arrays.asList("apple", "banana", "cherry");
		stringList.forEach(System.out::println);
	}
}
/*
 Output: c) stringList.forEach().

Java 8 introduced the forEach() method, which allows you to iterate over a collection 
in a more concise and expressive way. This method takes a lambda expression or a method reference as an argument, 
which is applied to each element in the collection.

 */
 