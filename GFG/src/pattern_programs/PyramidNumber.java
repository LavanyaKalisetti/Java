/*
 Java Program to Print Pyramid Number Pattern
-A pyramid number pattern of row size r = 5 would look like:
        1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5

-A pyramid number pattern of row size r = 4 would look like:
      1 
    2 3 2 
  3 4 5 4 3 
4 5 6 7 6 5 4 
 */
package pattern_programs;

public class PyramidNumber {
	public static void main(String[] args) {
		int num=5;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			 for (int j = 0; j <i; j++) {
	                System.out.print((i + j)+" ");
			 }
	            for (int j = i-2; j >=0; j--) {
	                System.out.print((i +j)+ " ");
		}
	            System.out.println();
		}
	}

}
