/*
 WAP for the following requirement:
 -Create a functional interface which has a functionality 
  to take a number and display it in words.(only if it is within 0-9)
 -Perform functional programming with support of lamda expression
  to provide implementation to the SAM
 */

package com.nt.functinalProgramming;

import java.util.Scanner;

@FunctionalInterface
 interface WordDisplay {
	public abstract void generateWord(int num);
	public static void main(String args[]) {
	
		WordDisplay w1=(n)->{
			   String word[]= {"Zero","One","Two","Three","Four","Five",
					           "Six","Seven","Eight","Nine","Ten"};
			   if(n>=0 && n<=9) 
				   System.out.println(word[n]);
			   else 
				   System.out.println("Try Again");};
			   
				   Scanner sc=new Scanner(System.in);
				   System.out.println("Enter the number between 0-9 to display in words:");
				   w1.generateWord(sc.nextInt());
	}
}
		