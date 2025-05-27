/*
   Java Program to Print Mirror Upper Star Triangle Pattern.
   
  The pattern has two parts – both mirror reflections of each other. 
  The base of the triangle has to be at the bottom of the imaginary mirror
  and the tip at the top.

  Input:
  size = 7

  Output:

      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 
* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
 */

package pattern_programs;

public class MirrorUpperStar {
	public static void displayUpperPart(int size) {
		int m,n;
		for(m=size-1;m>=0;m--) {
			for(n=0;n<m;n++) {
				System.out.print(" ");
			}
			for(n=m;n<=size-1;n++) {
				System.out.print("*"
			                     + " ");
			}
			System.out.println();
		}
	}
	
	public static void displayLowerPart(int size) {
		int m,n;
		for(m=1;m<=size;m++) {
			for(n=1;n<m;n++) {
				System.out.print(" ");
			}
			for(n=m;n<=size;n++) {
				System.out.print("*"
			                     + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int size=10;
		displayUpperPart(size);
		displayLowerPart(size);
	}

}
