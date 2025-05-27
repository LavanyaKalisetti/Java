/*
 * WAP to find the sum of all elements in array.
 */

package com.nt.array;

public class SumOfElements {
	public static void main(String[] args) {
		int arr[]= {2,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum all the elements:"+sum);
		}
		  
	}

