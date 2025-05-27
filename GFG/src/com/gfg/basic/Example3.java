/*
 3. Using Console Class:-
 ---------------------------
    Console Class has been becoming a preferred way for reading user’s input 
    from the command line, Introduced in JDK 1.6. 
    In addition, it can be used for reading password-like input 
    without echoing the characters entered by the user;
    the format string syntax can also be used (like System.out.printf()).
    
    Advantages:
   -------------
   1.Reading password without echoing the entered characters.
   2.Reading methods are synchronized.
   3.Format string syntax can be used.
   4.Does not work in non-interactive environment (such as in an IDE).
 */
package com.gfg.basic;

import java.util.Scanner;

public class Example3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		System.out.println("Enter the String:"+s);
	}

}
