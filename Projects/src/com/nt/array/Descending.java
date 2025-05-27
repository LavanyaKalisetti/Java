/*
 * WAP to sort an array in Descending order.
 */
package com.nt.array;

import java.util.Arrays;

public class Descending {
	public static void main(String[] args) {

		  int arr[]= {10,90,40,80};
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr.length-i-1;j++) 
			  {
					  if(arr[j]<arr[j+1]) { 
					  int k=arr[j];
					  arr[j]=arr[j+1];
					  arr[j+1]=k;
				  }
			  }
	  }
	  // System.out.println(Arrays.toString(arr));//PDM
	   	  System.out.println("Elements in Descending order:");
		  for(int i:arr) {
			System.out.println(i);
		  }
	}
}

