/*
 WAP to allow the user to specify how many elements has to be stored.
 After then enter the elements and perform the following operations:
 1.Display all the elements
 2.Display the elements which is divisible by 5
 3.Display positive elements
 4.Display the Negative elements
 5.Display the sum of all the elements
 6.Display the elements which are divisible by both 2 and 3.
 
*/
package com.nt.array;

import java.util.Scanner;

public class Test {
	public static void displayAllElements(int arr[]) {
		System.out.println("Elements stored in array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void displayElementsDivisibleBy5(int arr[]) {
		System.out.println("Elements are divisible by 5 which are stored "+" in array:");
		for(int i=0;i<arr.length;i++) {
			if( arr[i]%5==0)
				System.out.println(arr[i]);
		}
	}
	public static void  displayPositiveElements(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				System.out.println(arr[i]);
		}
	}
	public static void  displayNegativeElements(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				System.out.println(arr[i]);
		}
	}
	public static void displaySumOfElements(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum is:"+sum);
	}
	public static void displayElementsDivisibleBy2_3(int arr[]) {
		System.out.println("Elements divisivle by both 2 and 3 which are stored"+"in array:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i]%3==0)
				System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements to be stored:");
		int size=sc.nextInt();
		
		if(size>0) {
			int arr[]=new int[size];
			System.out.println("Array is Created");
			System.out.println("Enter "+size+" Elements into array:");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Elements entered successfully");
			System.out.println("Enter Your Choice:");
			System.out.println("1.Display all the elements\r\n"
					+ " 2.Display the elements which is divisible by 5\r\n"
					+ " 3.Display positive elements\r\n"
					+ " 4.Display the Negative elements\r\n"
					+ " 5.Display the sum of all the elements\r\n"
					+ " 6.Display the elements which are divisible by both 2 and 3.");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				displayAllElements(arr);
				break;
			
		    case 2:
		    	displayElementsDivisibleBy5(arr);
		    	break;
		    
		    case 3:
		    	displayPositiveElements(arr);
		    	break;
			
		    case 4:
		    	displayNegativeElements(arr);
		    	break;
		
		    case 5:
		    	displaySumOfElements(arr);
		    	break;
		    	
		    case 6:
		    	displayElementsDivisibleBy2_3(arr);
		    	break;
		    	default:
		    		System.out.println("Invalid choice");
			}
		}
		else
		{
			System.out.println("Array size should not be negative");
		}
			
	}
	

}
