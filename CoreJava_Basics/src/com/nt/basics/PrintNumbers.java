package com.nt.basics;

import java.util.Scanner;

public class PrintNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		//for(int i=0;i<=n;i++) 
		
		for(int i=n;i>-1;i--) //Reverse the Numbers
		{
			System.out.println(i+" ");
		}
	}

}
