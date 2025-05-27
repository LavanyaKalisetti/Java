/*
 Java Program for compound interest:
 
 Compound Interest formula: Compound Interest = P(1 + R/100)t
                            Where,
                                  P is principal amount
                                  R is the rate and
                                  T is the time span 
 */
package gfg.programs;

public class CompoundInterest {
	public static void main(String args[]) {
		double p=1000;
		double r=10.25;
		double t=1;
		
		double CI=p*(Math.pow(1+r/100, t));
		System.out.println("The compound Interest is:"+ CI);
	}

}
