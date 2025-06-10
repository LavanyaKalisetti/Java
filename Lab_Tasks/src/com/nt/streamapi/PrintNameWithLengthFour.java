/*
3)PrintNameWithLengthFour
Write a Java program that processes a list of names to filter, sort, and print names with a length of exactly 4 characters.
Requirements:
Use a list of strings containing names as input.
Filter out names that are not exactly 4 characters long.
Sort the filtered names in lexicographical order (alphabetical order).
Limit the output to the first 2 names after sorting.
Print each name on a new line.

Input : 
A List of strings: ["Toby", "Anna", "Leroy", "Alex"]
Expected Output:
Anna
Alex
Sample Input
A List of strings: ["Toby", "Anna", "Leroy", "Alex"]

Sample Output:
Anna
Alex

 */

package com.nt.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class PrintNameWithLengthFour {
    public static void main(String[] args) {
        // Input list of names
        List<String> names = List.of("Toby", "Anna", "Leroy", "Alex");

        // Filter names with length 4, sort them, limit to first 2, and print
        names.stream()
                .filter(name -> name.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}

