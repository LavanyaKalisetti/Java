package com.nt.finallyBlock;

public class Test13_finally {
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
		catch(NumberFormatException e){
			System.out.println("  In catch");
			return 20; 
		}
		finally {
			System.out.println("  In finally");	
			int[] ia = new int[5];
			return 30;
		}


	}

}
