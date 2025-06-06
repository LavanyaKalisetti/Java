/*
 * What is the output of the following code
     A.	0 1 2 3 4 5 6 7 8 9
     B.	1 2 3 4 5 6 7 8 9
     C.	1 2 3 4 5 6 7 8 10
     D.	1 2 3 4 5 6 7 8
 */
package com.nit.mcqs;

import java.util.ArrayList;

public class MCQ5{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList();
		for(int i=0;i<10;i++) 
		{
			al.add(i);
		}
		for(int str: al)
                {
			System.out.print(str+" ");
                }
	}

}
/*
 Output: A.	0 1 2 3 4 5 6 7 8 9
*/