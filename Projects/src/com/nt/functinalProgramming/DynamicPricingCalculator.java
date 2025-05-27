package com.nt.functinalProgramming;

import java.util.Scanner;

@FunctionalInterface
interface PricingStrategy {
 double calculatePrice(double totalAmount, boolean isFrequentShopper);
}

@FunctionalInterface
interface ProductCategoryChecker {
 double applyCategoryDiscount(double totalAmount, String category);
}

public class DynamicPricingCalculator {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Welcome to the Online Marketplace!");

     System.out.print("Enter the total order amount in rupees: ₹");
     double totalAmount = sc.nextDouble();
     sc.nextLine(); 
     
     System.out.print("Are you a frequent shopper? (yes/no): ");
     String frequentInput = sc.nextLine();
     boolean isFrequentShopper = frequentInput.equalsIgnoreCase("yes");

     System.out.print("Enter the product category: ");
     String category = sc.nextLine().toLowerCase();

     ProductCategoryChecker categoryDiscount = (amount, cat) -> {
         switch (cat) {
             case "electronics":
                 return amount * 0.90; 
             case "clothing":
                 return amount * 0.95; 
             default:
                 return amount; 
         }
     };

     PricingStrategy pricingStrategy = (amount, isFrequent) -> {
         if (isFrequent) {
             return amount * 0.95; 
         }
         return amount;
     };

     double afterCategoryDiscount = categoryDiscount.applyCategoryDiscount(totalAmount, category);

     double finalPrice = pricingStrategy.calculatePrice(afterCategoryDiscount, isFrequentShopper);

     System.out.printf("Total cost after pricing strategy: ₹%.2f\n", finalPrice);
 }
}

