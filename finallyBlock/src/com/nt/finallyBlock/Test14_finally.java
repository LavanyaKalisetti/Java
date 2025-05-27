package com.nt.finallyBlock;

public class Test14_finally {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println( "Result: "+  m1()  );
		System.out.println("main end");
	}
	static int m1(){
		try{
			System.out.println("In try");		
			return 10;	
		}
		catch(Exception e){
			System.out.println("In catch");
		}
		finally{
			System.out.println("In finally");		
			return 20;
		}
		
	}

}
