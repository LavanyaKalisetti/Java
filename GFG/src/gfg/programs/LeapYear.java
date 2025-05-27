/*
 * Java Program to Find if a Given Year is a Leap Year:-
 -------------------------------------------------------
   Leap Year contains 366 days, which comes once every four years. 
   In this article, we will learn how to write the leap year program in Java.
 */

package gfg.programs;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		
		if(year%4==0) {
			System.out.println("The given year is leap year");
		}else
			System.out.println("The given year is not a leap year");
			
	}

}
