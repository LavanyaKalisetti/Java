/*
  Java Program to Print Right Triangle Star Pattern.
  Input : n = 5
  Output: 
         * 
         * * 
         * * * 
         * * * * 
         * * * * * 
         
 */
package pattern_programs;

public class RightTraingle {
	
	public static void StarRightTraingle(int n) {
		for(int a=0;a<n;a++) {
			for(int b=0;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		int n=5;
		StarRightTraingle(n);
		
	}

}
