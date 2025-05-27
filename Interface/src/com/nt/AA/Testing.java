package com.nt.AA;

	import java.util.Scanner;

	public class Testing {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt(); 
	        scanner.close();

	        MyCalculator calc = new MyCalculator();
	        System.out.println(calc.divisorSum(n)); 
	    }
	}

