/*
 * Java Program to Find GCD or HCF of Two Numbers:-
-----------------------------------------------------
   GCD (Greatest Common Divisor) or HCF (Highest Common Factor) 
   is the largest number that can divide both the given numbers.
 */
package gfg.programs;

public class GCD {
	static int gcd(int x,int y) {
	/*if(x==0)
		return y;
	if(y==0)
		return x;
	if(x==y)
		return x;
	if(x>y)
		return gcd(x-y,y);
	    return gcd(x,y-x);
	}*/
	if (y == 0) 
        return x; 
    return gcd(y, x % y); 
	}
	
	public static void main(String[] args) {
		int x=100;
		int y=88;
		System.out.println("GCD of "+x+" and "+y+" is "+gcd(x,y));
	}

}
