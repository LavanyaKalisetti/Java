package com.nt.finallyBlock;

public class Test12_finally {
	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}
	static void m1(){
		try{
			System.out.println("  In try");
			System.out.println(10/0); 
		}
		catch(NullPointerException e){
			System.out.println("  In catch");
		}
		finally{
			System.out.println("  In finally");	
			return;
		}
	}

}
