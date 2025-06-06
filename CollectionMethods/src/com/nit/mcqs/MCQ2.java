/*
 * What is the output of the following code
   A.	25 Naresh A 37
   B.	A 25 Naresh 37
   C.	25 A Naresh 37
   D.	37 Naresh A 25
 */
package com.nit.mcqs;

import java.util.ArrayList;
import java.util.Iterator;

public class MCQ2{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
                 {
			System.out.print(it.next()+" ");
                 }
	}
}
/*
 Output: A. 25 Naresh A 37 
 */
