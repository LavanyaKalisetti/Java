/*
    Java Program to Print Square Star Pattern
    
      **********************
      *                    *
      *                    *
      *                    *
      *                    *    
      *                    *
      *                    *
      **********************
      
      Approach:

Step 1: Input number of rows and columns.

Step 2: For rows of rectangle run the outer loop from 1 to rows.

for (i = 1; i < = rows; i++)
Step 3: For the column of the rectangle run the inner loop from 1 to columns.

for (j = 1; j < = columns; j++)
Step 4: Print star for first or last row or for first or last column, otherwise print blank space.

Step 5: After printing all columns of a row, print the newline after the inner loop.

 */

package pattern_programs;

public class PrintSquare {
	static void Square(int k, int l) {
		int a,b;
		
		for(a=1;a<=k;a++) {
			for(b=1;b<=l;b++) {
				if(a==1 || a==k || b==1 || b==l)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int k=8,l=22;
		Square(k,l);
		
	}

}
