package com.nt.functinalProgramming;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total order amount in rupees: ₹");
        double totalAmount = scanner.nextDouble();

        System.out.print("Is the current promotion available? (yes/no): ");
        String promoResponse = scanner.next().trim().toLowerCase();
        boolean hasPromo = promoResponse.equals("yes");

        System.out.print("Enter the number of purchases made by the customer: ");
        int numPurchases = scanner.nextInt();

        BiFunction<Double, Boolean, Double> applyDiscount = (amount, promo) -> {
            double discount = 0;

            if (amount > 1000) {
                discount = 0.10; 
            }

            if (promo) {
                discount += 0.05; 
            }

            return amount - (amount * discount);
        };

        IntPredicate multiplePurchasesCheck = purchases -> purchases > 1;

        if (multiplePurchasesCheck.test(numPurchases)) {
            totalAmount -= totalAmount * 0.02; 
        }

        double finalAmount = applyDiscount.apply(totalAmount, hasPromo);

        System.out.printf("Total cost after discount: ₹%.2f%n", finalAmount);
    }
}
