/* 
  How to Read and Print an Integer Value in Java?
 */

package com.gfg.basic;

import java.util.Scanner;

public class ReadandPrint {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter the Number:"+num);
	}

}
