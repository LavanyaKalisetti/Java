/*
 What is the output of the following code
 A.	ArrayIndexOutofBoundException
 B.	IndexOutOfBoundsException
 C.	25 Naresh A
 D.	NullPointerException
 */
package com.nit.mcqs;

import java.util.ArrayList;

public class MCQ4{
	public static void main(String[] args) 
          {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		al.remove(4);
		for(String str: al)
                {
			System.out.print(str+" ");
                }
	}
}
/*
 * Output: B.IndexOutOfBoundsException
 */
