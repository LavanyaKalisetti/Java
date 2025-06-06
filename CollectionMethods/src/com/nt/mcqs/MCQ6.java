/*
 * What will be the output of the following Java code?
 */
package com.nt.mcqs;

import java.util.ArrayList;

public class MCQ6{
	public static void main(String args[]) 
	{
		ArrayList<String> obj1 = new ArrayList<String>();
		ArrayList<String> obj2 = new ArrayList<String>();
		obj1.add("A");
		obj1.add("B");
		obj2.add("A");
		obj2.add(1, "B");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}

/*
 * Output: true
           3042
           3042
*/
