package com.nt.basics;

import java.util.Scanner;

public class PostiveNegativeCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("The Given number is Positive:"+num);
		}else if(num<0) {
			System.out.println("The Given number is Negative"+num);
		}else {
			System.out.println("The Given Number is Zero:"+num);
		}
		
		
	}

}
