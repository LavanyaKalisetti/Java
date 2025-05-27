package com.nt.finallyBlock;

public class Test10_finally {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("Result: "+m1());
		System.out.println("main end");
	}
	static int m1(){
		System.out.println("m1 start");
		try{
			System.out.println("  In try");
			return 10/0; 
		}
		catch(ArithmeticException e){
			System.out.println("  In catch");
			return 20; 
		}
		finally{
			System.out.println("  In finally");	
			return 30; 
		}


	
	}

}
