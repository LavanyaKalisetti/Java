/*
 * WAP to reverse an array.
 */
package com.nt.array;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		
	int arr[]= {10,4,6,3,8};
	int n=arr.length;
	for(int i=0;i<n/2;i++) {
		int temp=arr[i];
		arr[i]=arr[n-1-i];
		arr[n-1-i]=temp;
	}
	System.out.println("Reversed Array:"+Arrays.toString(arr));
	}
}
