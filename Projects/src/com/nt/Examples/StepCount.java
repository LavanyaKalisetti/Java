/*
   A smartwatch stores the number of steps taken every hour for 10 hours.
   You are required to calculate the total number of even step counts recorded
   during odd hours of the day to determine periods of low-intensity activity.
 */
package com.nt.Examples;

import java.util.Scanner;

public class StepCount {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int steps[]=new int[10];
		System.out.println("Enter steps count for 10 hours:");
		
		for(int i=0;i<steps.length;i++) {
			System.out.println(" Hour "+(i+1)+" : ");
			steps[i]=sc.nextInt();
		}
		int totalSteps=0;
		for(int i=0;i<10;i++) {
			int hour=i+1;
			if(hour % 1==0) {
				if(steps[i] % 2==0) {
					totalSteps +=steps[i];
				}
			}
			System.out.println("The steps Counts Recorded during odd hours of the day:"+totalSteps);
		}
	}

}
