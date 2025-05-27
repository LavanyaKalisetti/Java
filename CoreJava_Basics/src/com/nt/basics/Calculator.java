package com.nt.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Enter your Name:");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "! Welcome to Mini Calculator.");

        double lastResult = 0;
        boolean useLastResult = false;

        while (running) {

            System.out.println("\n--- Mini Calculator ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (^)");
            System.out.println("7. Repeat last Operation");
            System.out.println("8. Exit");
            System.out.print("Choose an Option (1-8): ");

            int choice = sc.nextInt();

            if (choice == 8) {
                System.out.println("Exiting Calculator. Goodbye!");
                running = false;
                break;
            }

            double num1, num2;

            if (choice == 7) {
                if (useLastResult) {
                    System.out.println("Repeating the last operation with result " + lastResult);
                    num1 = lastResult;
                    num2 = lastResult;
                } else {
                    System.out.println("No previous operation to repeat.");
                    continue;
                }
            } else {
                try {
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter numeric values.");
                    sc.nextLine(); // clear the buffer
                    continue;
                }
            }

            double result = 0; // ✅ FIXED: declared before use

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    break;
                case 5:
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 7:
                    // already handled above
                    break;
                default:
                    System.out.println("Invalid choice! Please select from 1 to 8.");
                    continue;
            }

            lastResult = result;
            useLastResult = true;
        }

        sc.close(); // close the Scanner
    }
}
