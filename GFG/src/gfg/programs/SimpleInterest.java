/*
 * Java Program to Calculate Simple Interest:
 
   Simple interest is a quick method of calculating the interest charge on a loan. 
   Simple interest is determined by multiplying the daily interest rate
   by the principal by the number of days that elapse between payments. 

  Simple interest formula: Simple Interest = (P x T x R)/100 
  Where, 
  P is the principal amount 
  T is the time and 
  R is the rate
  
 */
package gfg.programs;

public class SimpleInterest {
	public static void main(String[] args) {
		float p=2;
		float t=2;
		float r=2;
		
	    float SI=(p*t*r)/100;
	    System.out.println("The Simple Interest is "+SI);
	}

}
