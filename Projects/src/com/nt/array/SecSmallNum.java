/*
 * WAP to find the second smallest element in an array.
 */

package com.nt.array;

import java.util.Arrays;

public class SecSmallNum {
	public static void main(String[] args) {
		int arr[]= {9,4,7,3};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		  System.out.println("Smallest element:"+arr[arr.length-2]);
		}

}

