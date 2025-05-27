/*
 * Two promotional campaigns store the customer IDs who participated. Find the
   intersection of both campaigns to determine which customers qualified for double rewards.
   E.g., A = campaign1 customers, B = campaign2 customers, T = qualified customers.
 */
package com.nt.Examples;

import java.util.ArrayList;

public class Compaigns {
	public static void main(String[] args) {
		int A[]= {10,30,50,70,90};
		int B[]= {50,35,59,79,80};
	
		ArrayList<Integer> T = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    T.add(A[i]); 
                    break;
                }
            }
        }
        System.out.println("Customers qualified for double rewards:");
        for (int id : T) {
            System.out.println("Customer ID: " + id);
        }
    }
}