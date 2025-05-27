/*
 * WAP to check whether an array contains a specific element.
 */
package com.nt.array;

import java.util.Scanner;

public class SpecificElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Random/Specific Element:");
		int key=sc.nextInt();
		int arr[]= {10,29,56,87};
		boolean FoundElement=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				FoundElement=true;
				break;
			}
		}
		if(FoundElement) {
			System.out.println("Element "+key+" is in the Array");
		}else {
			System.out.println("Element "+key+" is not in the Array");
		}
	}

}
