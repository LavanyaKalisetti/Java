package com.nt.finallyBlock;

public class Test07_finally {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("before loop\n");

		for(int i=1; i<=10;i++){
			System.out.println("\n  In Loop Iteration: "+ i);
			try{
					System.out.println("    In try");
					if(i == 5)
						continue;
			}catch(ArithmeticException e){
					System.out.println("    In catch");
			}
			finally{
					System.out.println("    In finally");
			}
			System.out.println("    After try/catch/finally");
		}//for close
	
		System.out.println("\nAfter loop");
		System.out.println("main end");
	}

}
