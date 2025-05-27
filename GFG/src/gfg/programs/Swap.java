/*
 Java Program to Swap Two Numbers:
 Problem Statement: Given two integers m and n. 
                    The goal is simply to swap their values
                    in the memory block and write the java code demonstrating approaches.
                    
Approach 1: Swapping the Values Using Third Variable
 
package gfg.programs;

public class Swap {
	static void swapUsingTemp(int k, int l) {
		int temp=k;
		    k=l;
		    l=temp;
		    System.out.println("The value of k is"+"\s"+k+"."+"\nThe value of l is"+"\s"+l+".");
	}
	public static void main(String args[]) {
		int k=40, l=50;
		swapUsingTemp(k,l);
	}

}

  Approach 2: Swapping the Values Using Operator

package gfg.programs;

public class Swap {
	static void swapUsingOpe(int k, int l) {
		k=k^l;
		l=k^l;
		k=k^l;
		
		    System.out.println();
	}
	public static void main(String args[]) {
		int k=40, l=50;
		swapUsingOpe(k,l);
	}

}


 Approach 3: Using arithmetic operators  
 
package gfg.programs;
public class Swap {
	public static void main(String args[]) {
		int k=22, l=55;
		System.out.println("Before swapping:"+"The value of k is"+"\s"+k+"."+"\nThe value of l is"+"\s"+l+".");
		k=(k+l)-(l=k);
		System.out.println("After swapping:"+"The value of k is"+"\s"+k+"."+"\nThe value of l is"+"\s"+l+".");
	}
	
}
Approach 4: Swapping the Values Without Using Third Variable
            by using sum and differences concepts of math
*/
package gfg.programs;
public class Swap {
	static void swapwithoutThirdvar(int k, int l) {
		k=k+l;
		l=k-l;
		k=k-l;
	    System.out.println("The value of k is"+"\s"+k+"."+"\nThe value of l is"+"\s"+l+".");
}
public static void main(String args[]) {
	int k=7, l=5;
	swapwithoutThirdvar(k,l);
}

}














