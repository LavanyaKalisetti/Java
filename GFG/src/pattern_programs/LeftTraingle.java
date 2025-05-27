/*
  Java Program to Print Left Triangle Star Pattern.
  Input : n = 5
  Output: 
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 
         
 */
package pattern_programs;

public class LeftTraingle {
	
	public static void StarLeftTraingle(int n) {
		for(int a=0;a<n;a++) {
			for(int b=0;b<n-a-1;b++) {
				System.out.print("  "); // Two spaces for alignment
			}
			for (int k = 0; k <= a; k++) {
                System.out.print("* ");
            }
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		StarLeftTraingle(n);
	}
}
