/*
 * A user enters 4 numbers and 3 math operations of their choice into a calculator.
   The calculator should apply the operations sequentially from left to right and
   display the result.
   E.g., numbers = [8, 6, 4, 2], operations = ['+', '-', '*'] → (((8 + 6) - 4) * 2)
 */
package com.nt.Examples;

import java.util.Scanner;

public class SimpleCalc {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] numbers = new int[4];
	        System.out.println("Enter 4 numbers:");
	        for (int i = 0; i < 4; i++) {
	            numbers[i] = sc.nextInt();
	        }
	        char[] ops = new char[3];
	        System.out.println("Enter 3 operations (+, -, *, /):");
	        for (int i = 0; i < 3; i++) {
	            ops[i] = sc.next().charAt(0);
	        }
	        int result = numbers[0];
	        for (int i = 0; i < 3; i++) {
	            switch (ops[i]) {
	                case '+':
	                    result = result + numbers[i + 1];
	                    break;
	                case '-':
	                    result = result - numbers[i + 1];
	                    break;
	                case '*':
	                    result = result * numbers[i + 1];
	                    break;
	                case '/':
	                    if (numbers[i + 1] != 0) {
	                        result = result / numbers[i + 1];
	                    } else {
	                        System.out.println("Error: Division by zero!");
	                        return;
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid operator: " + ops[i]);
	                    return;
	            }
	        }

	        System.out.println("Result: " + result);
	    }
	}



