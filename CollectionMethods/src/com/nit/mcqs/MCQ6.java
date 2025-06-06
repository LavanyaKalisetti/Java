/*
 * Choose the correct output of the following code
    A.	4 5 6 7 8
    B.	5 6 7 8
    C.	4 5 6 7 8 9
    D.	5 6 7 8 9
 */
package com.nit.mcqs;

import java.util.ArrayList;

public class MCQ6{
	public static void main(String[] args) 
       {
		ArrayList<Integer> al = new ArrayList();
		for(int i=5;i<10;i++) 
		{
			al.add(i);
		}
		al.remove(4);
		for(int str: al)
              {
			System.out.print(str+" ");
              }
	}
}
/*
   Output: B. 5 6 7 8
*/