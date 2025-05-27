package com.nt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test05_PassingAndReturningArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many object do you want to store?: ");
		int numbeOfValues = scn.nextInt(); scn.nextLine();
		
		int[] ia = new int[numbeOfValues];
		for(int i=0; i<numbeOfValues; i++) {
			System.out.print("Enter value"+(i+1)+": ");
			ia[i] = scn.nextInt();
		}
		System.out.println();
		
		int[] resArray = AddSub.addSub(ia);
		System.out.println("Addition    of "+ Arrays.toString(ia) + " is: "+ resArray[0]);
		System.out.println("Subtraction of "+ Arrays.toString(ia) + " is: "+ resArray[1]);
		
	}

}
