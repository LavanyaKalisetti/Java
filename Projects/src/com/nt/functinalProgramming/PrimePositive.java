/*
   Write a Java program that prompts the user to enter a positive integer 
   and checks if the entered number is both positive and prime. 
   The program should use lambda expressions to implement the necessary checks and print out the results separately.

   Your program should follow these specifications:
   ------------------------------------------------

   Input:
         Prompt the user to enter a positive integer.
         
   Processing:
             Implement a lambda expression to check if a given number is positive, using the Predicate interface.
             Implement a lambda expression to check if a given number is prime,  using the Predicate interface.
             Use the implemented lambda expressions to separately check if the entered number is positive and if it is prime.

   Output:
          Print whether the entered number is positive.
          Print whether the entered number is prime
 */
package com.nt.functinalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;

public class PrimePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        Predicate<Integer> isPositive = n -> n > 0;

        Predicate<Integer> isPrime = n -> {
            if (n < 2) 
            	return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) 
                	return false;
            }
            return true;
        };

        System.out.println("Is the number positive? " + isPositive.test(number));
        System.out.println("Is the number prime? " + isPrime.test(number));
    }
}
