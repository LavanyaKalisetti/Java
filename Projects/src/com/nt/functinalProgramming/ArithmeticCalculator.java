package com.nt.functinalProgramming;

import java.util.Scanner;
import java.util.function.BiFunction;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        BiFunction<Double, Double, Double> operation;

        switch (choice) {
            case 1:
                operation = (a, b) -> a + b;
                System.out.println("Result of addition: " + operation.apply(num1, num2));
                break;
            case 2:
                operation = (a, b) -> a - b;
                System.out.println("Result of subtraction: " + operation.apply(num1, num2));
                break;
            case 3:
                operation = (a, b) -> a * b;
                System.out.println("Result of multiplication: " + operation.apply(num1, num2));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
