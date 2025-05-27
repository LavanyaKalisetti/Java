/*
   Java Program to Print Downward Triangle Star Pattern.
   
   Downward triangle star pattern means we want to print a triangle 
   that is downward facing means base is upwards and by default, 
   orientation is leftwards so the desired triangle to be printed should look like
   
        * * * *
        * * *
        * *
        *

 */

package pattern_programs;

public class DownwardTraingle {
	public static void main(String args[]) {
		int n=6;
		for(int a=n-1;a>=0;a--) {
			for(int b=0;b<=a;b++) {
				System.out.print("*"
	                     + " ");
			}
			System.out.println();
		}
	}

}
