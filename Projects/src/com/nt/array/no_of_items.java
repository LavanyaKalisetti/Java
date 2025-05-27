/*
A retail store records the number of items sold per day over a week.
Management wants to analyze on which day the least number of items were sold.
Requirement:
Write a Java program that takes the number of items sold each day for 7
days in an array and finds the minimum value among them, representing the
day with the least sales.
*/
package com.nt.array;

import java.util.Scanner;

public class no_of_items {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No.of Items:");
		int size=sc.nextInt();
		int arr[]=new int[7];
		
		int minSal=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(minSal>arr[i]) {
				minSal=arr[i];
			}
	    }
				System.out.println("Minimum Element:"+minSal);
		
			
	}

}
