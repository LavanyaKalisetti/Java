/*
2. Using Scanner Class:-
------------------------
   Scanner Class is probably the most preferred method to take input, 
   Introduced in JDK 1.5. 
   The main purpose of the Scanner class is to parse primitive types and 
   strings using regular expressions; 
   however, it is also can be used to read input from the user in the command line. 

Convenient methods for parsing primitives (nextInt(), nextFloat(), …) from the tokenized input.
Regular expressions can be used to find tokens.
The reading methods are not synchronized.
 */

package com.gfg.basic;

import java.util.Scanner;

public class Example2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		System.out.println("Enter the String:"+s);
		System.out.println();
		
		System.out.println("Enter the Integer:");
		int a=sc.nextInt();
		System.out.println("Enter the Integer:"+a);
		System.out.println();
		
		System.out.println("Enter the FloatNumber:");
		float f=sc.nextFloat();
		System.out.println("Enter the FloatNumber:"+f);
		System.out.println();
		}

}
