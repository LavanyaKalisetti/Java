package com.nt.array;

import java.util.Arrays;

public class P1 {
  public static void main(String args[]) {
	  
/*	  using Primitive data type
	  int arr[]= {10,34,54,87,98}; 
	  	  Arrays.sort(arr);
	  int min=arr[0];
	  int max=arr[arr.length-1];
	  System.out.println("Smallest element:"+min);
	  System.out.println("Largest element:"+max);
*/  
/*using nested loop to fetch each element and compare 
  with remaining validate and swap the values.print the elements.

	  int arr[]= {10,90,40,80};
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr.length-i-1;j++) 
		  {
			 // if(arr[j]<arr[j+1]) { descending order-[90, 80, 40, 10]
				  if(arr[j]>arr[j+1]) { //ascending order-[10, 40, 80, 90]
				  int k=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=k;
			  }
	  }
  }
   System.out.println(Arrays.toString(arr));//PDM
   	  System.out.println("Elements in ascending order:");
	  for(int i:arr) {
		System.out.println(i);

	  
	  System.out.println("Smallest element:"+arr[0]);
	  System.out.println("Largest element:"+arr[arr.length-1]);
	}
	}
*/
int arr[]= {2,4,5};
int sum=0;
for(int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
}
System.out.println("Sum all the elements:"+sum);
}
  }



