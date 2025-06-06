/*
 * What is the output of the following code
    A.	false true false
    B.	false false false
    C.	true true true
    D.	true false true

 */
package com.nit.mcqs;

import java.util.ArrayList;

public class MCQ9{
	public static void main(String[] args){
		ArrayList al = new ArrayList<>();
		al.add(5);
		al.add("");
		al.add(10);
		System.out.print(al.contains(6)+" ");
		System.out.print(al.contains(10)+" ");
		System.out.println(al.contains(null));
	}
}

/*
 * Output: A. false true false
*/