/*
 Q30.What happens when you call get() on an empty Optional object?

 a) Returns null

 b) Returns a default value

 c) An NoSuchElementException is thrown

 d) An OptionalException is thrown

*/

package com.nt.mcqs;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Test30 {
	public static void main(String args) {
		Optional<String> emptyOptional = Optional.empty();
		try {
		    String value = emptyOptional.get();
		} catch (NoSuchElementException e) {
		    System.out.println("No value present");
		}
	}

}
/*
 * Output: c) A NoSuchElementException is thrown.

When you call get() on an empty Optional object, it throws a NoSuchElementException. 
This is because get() is designed to return the value inside the Optional if it's present, 
but if the Optional is empty, there's no value to return.

 */
