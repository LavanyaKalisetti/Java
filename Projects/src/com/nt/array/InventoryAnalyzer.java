package com.nt.array;

import java.util.Scanner;

public class InventoryAnalyzer {
	//static int getSecondLargest
	
	 static int getSecondLargest(int[] arr) {
		if(arr==null || arr.length<2) {
			return -1;
		}
	int largest=Integer.MIN_VALUE;
	int secondLargest=Integer.MAX_VALUE;
	for(int num:arr) {
		if(num>largest) {
			secondLargest=largest;
			largest=num;
		}
		else if(num<largest && num>secondLargest) {
			secondLargest=num;
		}
	}
	return (secondLargest==Integer.MIN_VALUE)? -1 : secondLargest;
	}
	public static void main(String[] args) {
		int [] arr= {-150,-130,-130};
		System.out.println(getSecondLargest(arr));
		}
	
}