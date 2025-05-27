/*
   Java Program to Print Reverse Pyramid Star Pattern
 */
package pattern_programs;

public class ReversePyramid {
	public static void main(String args[]) {
		int n = 5;
		int i=n,j;
		while(i>0) {
			j=0;
			while(j++<n-i) {
				System.out.print(" ");
			}
			j=0;
			while(j++<(i*2)-1) {
				System.out.print("*");
			}
				System.out.println();
				i--;
			}
		}
}

