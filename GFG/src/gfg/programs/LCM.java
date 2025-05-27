/*
 Java Program to Find LCM of Two Numbers:-
------------------------------------------
   LCM (Least Common Multiple) is the largest of the two stated numbers
   that can be divided by both the given numbers.
  
 */

package gfg.programs;

public class LCM {
	public static void main(String[] args) {
		int a=15;
		int b=25;
		int LCM=(a>b)?a:b; //Ternary Operator(? :)
		while(true) {
			if(LCM%a==0 && LCM%b==0) 
				break;
			    LCM++;
			}
		System.out.println("LCM of " +a+" and "+b+" : "+LCM);
		}
	}


