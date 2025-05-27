/*
 * Java Program for Factorial of a Number
   Formula: n! = n * (n-1) * (n-2) * (n-3) * …….. * 1
   Example: 
            6! == 6*5*4*3*2*1 = 720. 
            5! == 5*4*3*2*1 = 120
            4! == 4*3*2*1 = 24
 */
package gfg.programs;

import java.util.Scanner;

public class Factorial {
	
		static int fac(int num) {
		   int res = 1;
			for (int i = 2; i <= num; i++)
	            res *= i;
	        return res;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number:");
			int num=sc.nextInt();
	        System.out.print("The given number is factorial:"+fac(num));
	
}
}
