/*
 * Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes
 * 
   For a given positive integer N, the purpose is to find the value of F2 + F4 + F6 +………+ F2n till N number. 
   Where Fi indicates the i’th Fibonacci number.
   The Fibonacci Series is the numbers in the below-given integer sequence.
   Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ……
 */
package gfg.programs;

import java.util.Scanner;

public class FebonacciSeries {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Terms:");
		int n=sc.nextInt();
		
		int First=0;
		int Second=1;
		System.out.println("Febonacci Series:");
		
		for(int i=0;i<n;i++) {
			System.out.println(First+" ");
			int next=First+Second;
			First=Second;
			Second=next;
		}
	}
}
