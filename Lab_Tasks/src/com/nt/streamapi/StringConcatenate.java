/*
2)StringConcatenate
Write a Java program that uses the Stream.of method to create a stream of strings, filters out the empty strings, and then concatenate the remaining strings into a single string..

Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Output:
A single concatenated string:
HelloWorld from Java!
Sample Input
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Sample Output:
A single concatenated string:
HelloWorld from Java!
 */

package com.nt.streamapi;

import java.util.stream.Stream;

public class StringConcatenate {
    public static void main(String[] args) {
        // Create a stream of strings
        String result = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!")
                // Filter out empty strings
                .filter(s -> !s.isEmpty())
                // Concatenate the remaining strings
                .reduce("", (a, b) -> a + b);

        System.out.println("Concatenated string: " + result);
    }
}

