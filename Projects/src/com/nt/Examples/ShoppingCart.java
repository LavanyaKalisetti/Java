/*
 * A shopping cart stores 10 items. The user wants to remove an item from a
   specific position. Write a program to delete the item from that position and
   display the updated cart.
 */
package com.nt.Examples;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cart = new String[10];
        for (int i = 0; i < 10; i++) {
            cart[i] = "Item" + (i + 1);
        }
        
        System.out.print("Enter the position (1-10) of the item to remove: ");
        int position = sc.nextInt();
        if (position < 1 || position > 10) {
            System.out.println("Invalid position. Please enter between 1 and 10.");
            return;
        }
   
        for (int i = position - 1; i < 9; i++) {
            cart[i] = cart[i + 1];
        }
        cart[9] = null; 
        
        System.out.println("\nUpdated Shopping Cart:");
        for (int i = 0; i < 9; i++) {
            System.out.println("Position " + (i + 1) + ": " + cart[i]);
        }
    }
}

