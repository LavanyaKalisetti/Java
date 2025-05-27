/*
 * Two teachers have marked the same set of 5 assignments. Their scores are
   stored in arrays A and B. You need to generate a final score array C by summing
   the corresponding scores given by both teachers.
 */
package com.nt.Examples;

public class ScoreCalc {
	public static void main(String args[]) {
		int A[]= {45,87,98,78,50};
		int B[]= {59,97,80,86,60};
		int C[]=new int[5];
		
		for(int i=0;i<5;i++) {
			C[i]=A[i]+B[i];
		}
		System.out.println("Final Scores:");
		for(int i=0;i<5;i++) {
			System.out.println("Assignments " + (i + 1) + ": " + C[i]);
		}
	}

}
