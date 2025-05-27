/*
 * WAP to find the duplicate elements in an array.
 */
package com.nt.array;

import java.util.Scanner;

public class DuplicateElement {
	public static void main(String[] args) {
		
		int arr[]= {3,6,8,6,8};
		System.out.println("Duplicate elements in the array are:");
		
		boolean DuplicateFound=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1) {
				continue;
			}
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				DuplicateFound=true;
				arr[j]=-1;
			}
		}
		if(DuplicateFound) {
			System.out.println(arr[i]);
		}
		}
	}

}
