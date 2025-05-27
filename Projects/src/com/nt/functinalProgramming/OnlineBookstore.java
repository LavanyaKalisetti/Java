/*
  Dynamic Discount Calculation for Online Bookstore

  You are assigned to develop a Java program for an online bookstore 
  that calculates the total cost of a customer's order with a dynamic discount system. 
  The discount calculation is influenced by the customer's spending habits rather than their membership status. 
  Your task is to design a flexible solution using functional interfaces and lambda expressions 
  to handle the discount calculation process effectively.

Your program should include the following components:
-----------------------------------------------------

Functional Interfaces:

 Define a functional interface named DiscountPolicy with a method double applyDiscount(double totalAmount, boolean hasHighSpending) 
 that encapsulates the logic for applying discounts based on the current policy. 
 The hasHighSpending parameter indicates whether the customer has high spending habits.
 Functional Interface for Customer Spending Habits:

 Define another functional interface named CustomerSpendingHabitChecker with a method
 boolean hasHighSpending(double totalPurchaseAmount) 
 that checks if the customer's total purchase amount exceeds a certain threshold, indicating high spending behavior.
 Main Program:

 Prompt the user to enter the total order amount in rupees.
 Prompt the user to specify the customer's spending habits (whether they have high spending or not).
 Apply the lambda expressions representing the discount policy and customer spending habit checking to 
 calculate the discounted amount based on the provided inputs.
 Calculate and print the total cost of the order after applying the discount in rupees.
 Discount Policy Logic:

Initially, the discount policy offers a 10% discount for orders above ₹1000 
and an additional 5% discount for customers with high spending habits. 
The discount policy can be modified in the future to accommodate different thresholds and percentages.

Sample Input and Output:
----------------------------
Welcome to the Online Bookstore!

Enter the total order amount in rupees: 1200
Does the customer have high spending habits? (yes/no): yes

Total cost after discount: 1080.00

 */

package com.nt.functinalProgramming;

import java.util.Scanner;

@FunctionalInterface
interface DiscountPolicy {
 double applyDiscount(double totalAmount, boolean hasHighSpending);
}

@FunctionalInterface
interface CustomerSpendingHabitChecker {
 boolean hasHighSpending(double totalPurchaseAmount);
}

public class OnlineBookstore {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Welcome to the Online Bookstore!");
     System.out.println();

     System.out.print("Enter the total order amount in rupees: ");
     double totalAmount = sc.nextDouble();
     sc.nextLine(); 

     System.out.print("Does the customer have high spending habits? (yes/no): ");
     String input = sc.nextLine().trim().toLowerCase();

     CustomerSpendingHabitChecker spendingChecker = amount -> amount > 10000;

     boolean hasHighSpending = input.equals("yes") || spendingChecker.hasHighSpending(totalAmount);

     DiscountPolicy discountPolicy = (amount, highSpending) -> {
         double discount = 0;
         if (amount > 1000) {
             discount += 0.10; 
         }
         if (highSpending) {
             discount += 0.05; 
         }
         return amount * (1 - discount);
     };

    
     double discountedTotal = discountPolicy.applyDiscount(totalAmount, hasHighSpending);

     
     System.out.printf("Total cost after discount: %.2f\n", discountedTotal);
 }
}
