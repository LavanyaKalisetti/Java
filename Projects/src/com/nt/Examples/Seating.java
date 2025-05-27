/*
   In a classroom, there are 10 seats. Students from Group A and Group B are
   to be seated alternately:
   Odd positions (1, 3, 5, 7, 9) → Students from Group A
   Even positions (2, 4, 6, 8, 10) → Students from Group B
   Store and display the final seating arrangement using array C.
 */
package com.nt.Examples;

public class Seating {
	public static void main(String args[]) {
		String[] C = new String[10];
		
		for (int i = 0; i < 10; i++) {
	        if ((i + 1) % 2 == 1) 
	            C[i] = "Group A"; 
	         else 
	            C[i] = "Group B"; 
	        }
	    
	System.out.println("Final Seating Arrangement:");
    for (int i = 0; i < 10; i++) {
        System.out.println("Seat " + (i + 1) + ": " + C[i]);
    }
}
}
	