
/*
 * Q19. What is the difference between the map() and flatMap() methods in Optional?

        a) map() can return null, flatMap() cannot

        b) map() returns an Optional, flatMap() returns the value directly

        c) flatMap() flattens nested Optionals, map() does not

        d) There is no difference
 */
package com.nt.mcqs;

import java.util.Optional;

public class Test19 {
	public static void main(String args[]) {
		Optional<String> optional = Optional.of("hello");

		// Using map()
		Optional<String> mappedOptional = optional.map(String::toUpperCase);
		System.out.println(mappedOptional); // Optional[HELLO]

		// Using flatMap()
		Optional<String> flatMappedOptional = optional.flatMap(s -> Optional.of(s.toUpperCase()));
		System.out.println(flatMappedOptional); // Optional[HELLO]
	}

}

/*
 
 Output :c) flatMap() flattens nested Optionals, map() does not.

*The map() and flatMap() methods in Optional are both used to transform the value 
 inside the Optional, but they differ in how they handle the result:

- map(): Applies a function to the value inside the Optional and returns a new Optional containing the result. If the mapping function returns null, map() will return an empty Optional.
- flatMap(): Similar to map(), but it expects the mapping function to return an Optional itself. flatMap() then "flattens" the result, returning a single Optional instead of a nested Optional<Optional<T>>.

In the example above, both map() and flatMap() produce the same result. 
However, if the mapping function returns an Optional, flatMap() will flatten the result, 
while map() would return a nested Optional.

For instance:
Optional<String> optional = Optional.of("hello");

// Using map()
Optional<Optional<String>> nestedOptional = optional.map(s -> Optional.of(s.toUpperCase()));
System.out.println(nestedOptional); // Optional[Optional[HELLO]]

// Using flatMap()
Optional<String> flatMappedOptional = optional.flatMap(s -> Optional.of(s.toUpperCase()));
System.out.println(flatMappedOptional); // Optional[HELLO]

In this case, map() returns an Optional<Optional<String>>, 
while flatMap() returns an Optional<String>, which is often more convenient to work with.
 
 
*/
