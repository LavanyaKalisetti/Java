/*
 WAP for the following requirement:
 -Create a functional interface which has a functionality 
  to display the number taken as input.
 -Perform functional programming with support of lamda expression
  to provide implementation to the SAM
 */
package com.nt.functinalProgramming;

@FunctionalInterface
interface NumberDisplayer {
	public abstract void displayNumber(int num) ;
		
	}
class Number{
	public static void main(String[] args) {
		NumberDisplayer n1=(input)->{
			System.out.println("The number is:"+input);
		};
		n1.displayNumber(20);
		}
	}

