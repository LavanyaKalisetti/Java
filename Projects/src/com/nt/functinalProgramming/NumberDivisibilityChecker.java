package com.nt.functinalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberDivisibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Predicate<Integer> isDivisibleBy2 = n -> n % 2 == 0;

        Predicate<Integer> isDivisibleBy3 = n -> n % 3 == 0;

        Predicate<Integer> isDivisibleBy5 = n -> n % 5 == 0;

        System.out.println("Is the number divisible by 2? " + isDivisibleBy2.test(number));
        System.out.println("Is the number divisible by 3? " + isDivisibleBy3.test(number));
        System.out.println("Is the number divisible by 5? " + isDivisibleBy5.test(number));
    }
}
