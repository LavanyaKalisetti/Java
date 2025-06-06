/*
 * What is the output of the following code
    A.	50 25 true
    B.	50 25 false
    C.	25 50 false
    D.	25 50 true
 */
package com.nit.mcqs;

import java.util.ArrayList;
import java.util.ListIterator;

public class MCQ10 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(50);
		al.add(25);
		ListIterator li = al.listIterator();
		while(li.hasNext())
                    {
			System.out.println(li.next());
                    }
		li.add(22);
		System.out.println(li.hasNext());
	}
}

/*
 * Output: B. 50
 *            25
 *            false
*/