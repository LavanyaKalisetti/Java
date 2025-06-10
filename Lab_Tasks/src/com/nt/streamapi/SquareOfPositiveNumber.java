/*
 5)SquareOfPositiveNumber
Write a Java program that reads an array of integers, filters out the negative numbers, and then calculates the sum of the squares of the remaining positive numbers using streams and the reduce method.

Input:
Input array: [-3, 2, -5, 6, -1, 4]
Output:
Sum of squares of positive numbers: 52

Testcase 1:-
Enter the number of elements: 6
Enter 6 integers:
-3
2
-5
6
-1
4
Sum of squares of positive numbers: 56
 * 
 */


package com.nt.streamapi;

import java.util.Arrays;

public class SquareOfPositiveNumber {
    public static void main(String[] args) {
        int[] numbers = {-3, 2, -5, 6, -1, 4};

        int sumOfSquares = Arrays.stream(numbers)
                .filter(n -> n > 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of squares of positive numbers: " + sumOfSquares);
    }
}
