/*
 Java Program to Check Armstrong Number between Two Integers
 */

package gfg.programs;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int OriginalNum=num;
		int result=0;
		
		int digits=String.valueOf(num).length();
		
		while(num>0) {
			int digit=num%10;
			result +=Math.pow(digit, digits);
			num /=10;
		}
		if(result==OriginalNum) {
			System.out.println(OriginalNum+" is a Armstrong number");
		}else
			System.out.println(OriginalNum+" is not a Armstrong number");
		}

}



