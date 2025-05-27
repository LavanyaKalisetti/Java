/*
 * WAP to find the frequency of each element in an array.
 */
package com.nt.array;

import java.util.Arrays;

public class Frequency {
	int[] elements= {10,12,13,10,10,13,12,13,15};
	int occuranceCount=0;
	public void displayRepeatedId() {
		Arrays.sort(elements);
		System.out.println("Array Elements: "+Arrays.toString(elements));
		for(int i=0;i<elements.length;i++) {
			int count=0;
			for(int j=0;j<elements.length-1;j++) {
				if(elements[i]==elements[j] && i>j) {
				    break;	
				}
				if(elements[i]==elements[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(elements[i]+" "+ "Available "+count+" times");
				occuranceCount++;
			}
		}
		System.out.println(occuranceCount+" Elements Are Repeated.");
	}


   public static void main(String[] args) {
	   Frequency r1=new Frequency();
	   r1.displayRepeatedId();
   }

}
