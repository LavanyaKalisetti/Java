/*
  Java Program to Check if a Given Integer is Odd or Even using Scanner class
 */
package gfg.programs;

import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("The given number is Even" +"\s"+num);
		}else {
			System.out.println("The given number is odd" +"\s"+num);
		}
	}

}
