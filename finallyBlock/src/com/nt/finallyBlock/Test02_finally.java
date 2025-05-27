package com.nt.finallyBlock;

public class Test02_finally {
	public static void main(String[] args) {
		System.out.println("Before try/catch/finally");
		try{
			System.out.println("  In try");
		}
		catch(ArithmeticException e){
			System.out.println("  In catch");
		}
		finally{
			System.out.println("  In finally");	
		}
		System.out.println("After try/catch/finally");
	}

}
