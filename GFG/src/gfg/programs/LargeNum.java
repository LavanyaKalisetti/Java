/*
 Java Program to Find the Largest of three Numbers using if-else statements
 */
package gfg.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;

public class LargeNum {
	/*
	  public static int BigNum(int a, int b, int c) {
	   if(a>=b && a>=c) 
	         return a;
	   else if (b>=a && b>=c) 
	         return b;
	   else
	        return c;
	        }    
       public static void main(String[] args) {
        int a=10; int b=98; int c=2; 
        int largest=BigNum(a,b,c);
	  System.out.println("The largest number is"+"\s"+largest);
	}
}
	 */
/*Using Math.max() method
public static void main(String[] args) {
	int a=90 ;int b=8; int c=9;
	int largest=Math.max(Math.max(a, b), c);
	System.out.println("the largest number is"+largest);
}
}
*/
/*Using Collections.max() method and ArrayList */
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=30;
		c=90;
		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(a);
		x.add(b);
		x.add(c);
		System.out.println(Collections.max(x)+" is the Largest number");
	}
}































