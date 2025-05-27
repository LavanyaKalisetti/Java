/*
   Java Program to Print Mirror Lower Star Triangle Pattern.
 
Input: number = 7
Output:
* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 


 */

package pattern_programs;

public class MirrorLowerStar {
	public static void main(String args[]) {
		int  num=7;
		int m,n;
		for(m=1;m<=num;m++) {
			for(n=1;n<m;n++) {
				System.out.print(" ");
			}
			for(n=m;n<=num;n++) {
				System.out.print("*" 
			                       +" ");
			}
			System.out.println();
		}
		for(m=num-1;m>=0;m--) {
			for(n=0;n<m;n++) {
				System.out.print(" ");
			}
			for(n=m;n<=num-1;n++) {
				System.out.print("*"
			                        +" ");
			}
			System.out.println();
		}
	}

}
