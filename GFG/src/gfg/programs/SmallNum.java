/*
 Java Program to Find the Smallest of three Numbers using if-else statements
 */
package gfg.programs;

public class SmallNum {
	public static int Small_Num(int a, int b, int c) {
		if(a<=b && a<=c) 
		   return a;
	    else if (b<=a && b<=c) 
		   return b;
		else
			return c;
	}
		public static void main(String[] args) {
			int a=10;
			int b=98;
			int c=2;
			int smallest=Small_Num(a,b,c);
			System.out.println("The smallest number is"+"\s"+smallest);
			
			
		}

}
