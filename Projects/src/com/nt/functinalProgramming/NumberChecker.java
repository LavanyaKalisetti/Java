/*
 WAP for the following requirement:
 -Create a functional interface which has a functionality 
  to take a number and display whether it is even or not
 -Perform functional programming with support of lamda expression
  to provide implementation to the SAM
 */
package com.nt.functinalProgramming;

@FunctionalInterface
interface NumberChecker {
	public abstract void showNumber(int num);
}
 class EvenOdd{
public static void main(String[] args) {
	NumberChecker  n1=(input)->{
		              if(input%2==0) {
		            	  System.out.println("Even");
		              }
		              else {
		            	  System.out.println("Odd");
		              }
	};
	n1.showNumber(19);
	}
}


