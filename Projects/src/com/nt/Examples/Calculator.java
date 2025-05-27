/*
   A scientific calculator has a memory buffer to pre-fill factorials of numbers
   from 1 to 10 for fast access. Write a program to automatically store factorials
   from 1 to 10 in an array and display them.
 */
package com.nt.Examples;

    public class Calculator {
    	public static void main(String[] args) {
    		int factorials[]=new int[10];
    		
    		for(int i=1;i<=10;i++) {
    			factorials[i-1]=calcfactorials(i);
    		}
    		System.out.println("Factorials from 1 to 10:");
    		for(int i=1;i<10;i++) {
    			System.out.println((i+1)+"!  ="+factorials[i]);
    		}
    	}

		private static int calcfactorials(int n) {
			int factorial=1;
			for(int i=2;i<=n;i++) {
				factorial *=i;
			}
			return factorial;
		}

}
