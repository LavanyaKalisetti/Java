/*
  Number Transformation

  Write a Java program that transforms a positive integer entered by the user using lambda expressions 
  and the Function functional interface. 
  The program should use lambda expressions to define the transformations: 
  one to double the number and another to square the number.

  Your program should follow these specifications:
  ------------------------------------------------

  Input:
        Prompt the user to enter a positive integer.
   
  Processing:
             Define a lambda expression to double the input number using the Function interface.
             Define a lambda expression to square the input number using the Function interface.
             Apply both lambda expressions to the input number separately to obtain the transformed results.

  Output:
         Print the result of doubling the entered number.
         Print the result of squaring the entered number.
         
 */

package com.nt.functinalProgramming;

import java.util.Scanner;
import java.util.function.Function;

public class NumberTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        Function<Integer, Integer> doubleNumber = n -> n * 2;

        Function<Integer, Integer> squareNumber = n -> n * n;

        int doubled = doubleNumber.apply(number);
        int squared = squareNumber.apply(number);

        System.out.println("Double of the number: " + doubled);
        System.out.println("Square of the number: " + squared);
    }
}
