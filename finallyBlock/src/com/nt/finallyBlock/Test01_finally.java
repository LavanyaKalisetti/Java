package com.nt.finallyBlock;

public class Test01_finally {
	public static void main(String[] args) {
		System.out.println("Before try/catch/finally");
		try {
			System.out.println("In try block");
		}
		catch(ArithmeticException e ) {
			System.out.println("After try/catch/finally");
			System.out.println("\nbefore try/finally");
		}
		try{
			System.out.println("  In try");
			}
		finally{
			System.out.println("  In finally");	
			}
			System.out.println("After try/finally");		
	}
	}

 