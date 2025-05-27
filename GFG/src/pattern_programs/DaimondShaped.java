/*
   Java Program to Print Diamond Shape Star Pattern
   
   Input: number = 7
 
   Output:

       *
      ***
     *****
    *******
   *********
  ***********
 *************
  ***********
   *********
    *******
     *****
      ***
       *
 */

package pattern_programs;

public class DaimondShaped {
	public static void main(String args[]) {
		int num=7;
		int m,n;
		for(m=1;m<=num;m++) {
			for(n=1;n<=num-m;n++) {
			System.out.print(" ");
		}
		for(n=1;n<=m*2-1;n++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(m=num-1;m>0;m--) {
		for(n=1;n<=num-m;n++) {
			System.out.print(" ");
		}
		for(n=1;n<=m*2-1;n++) {
			System.out.print("*");
		}
		System.out.println();
	}
  }
}
