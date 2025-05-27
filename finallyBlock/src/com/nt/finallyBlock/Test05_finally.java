package com.nt.finallyBlock;

public class Test05_finally {
	public static void main(String[] args) {
		System.out.println("main start");
			try{
				System.out.println("   In try ");		
					return;
			}
			catch(ArithmeticException e){
				System.out.println("   In catch ");		
			}
			finally{
				System.out.println("   In finally");		
			}
		
		System.out.println("   After t/c/f");
    	System.out.println("main end");

	}

}
