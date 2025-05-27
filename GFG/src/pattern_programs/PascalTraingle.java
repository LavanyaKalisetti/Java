/*
 * Java Program to Print Star Pascal’s Triangle:
   ---------------------------------------------
  Pascal’s triangle is a triangular array of the binomial coefficients. 
  Write a function that takes an integer value n as input and prints the first n lines of Pascal’s triangle. 
  Following are the first 6 rows of Pascal’s Triangle.In this article, 
  we will look into the process of printing Pascal’s triangle. 
  Pascal’s triangle is a pattern of the triangle which is based on nCr.
  below is the pictorial representation of Pascal’s triangle.
  
  Input : N = 5
  Output:
          1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1
1   5   10  10  5   1

 */

package pattern_programs;

public class PascalTraingle {
	public int factorial(int a) {
		if(a==0)
			return 1;
		return a * factorial(a-1);
	}
	public static void main(String args[]) {
		int k=5;
		int a,b;
		
		PascalTraingle pt=new PascalTraingle();
		for(a=0;a<=k;a++) {
			for(b=0;b<=k-a;b++) {
				System.out.print(" ");
			}
			for(b=0;b<=a;b++) {
				System.out.print(
						" "
			                    + pt.factorial(a)
			                          / (pt.factorial(a - b)
			                             * pt.factorial(b)));
			}
			System.out.println();
		}
	}

}
