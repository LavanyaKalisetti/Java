/*
 * Q12.What is the purpose of the Optional class in Java?

   A) To handle null values more gracefully

   B) To create immutable objects

   C) To manage thread synchronization

   D) To optimize memory usage
 */

package com.nt.mcqs;

import java.util.Optional;

public class Test12 {
	public static void main(String args[]) {
		Optional<String> optional = Optional.ofNullable("Hello");
		optional.ifPresent(System.out::println); // prints "Hello"

		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional.orElse("Default Value")); // prints "Default Value"

	}

}
/*
  Output: A) To handle null values more gracefully.

  The Optional class in Java is a container class that can hold a non-null value 
  or no value at all. Its primary purpose is to provide a way to handle null 
  values more elegantly and avoid NullPointerExceptions.

  With Optional, you can:
- Represent the absence of a value in a more explicit way
- Avoid null checks and reduce the risk of NullPointerExceptions
- Use methods like isPresent(), get(), orElse(), and ifPresent() 
  to handle the value in a more controlled manner

The other options are not correct:
- Optional is not primarily used for creating immutable objects (B).
- It does not manage thread synchronization (C).
- While Optional can help avoid null-related issues, it is not specifically designed for optimizing memory usage (D).
 */
