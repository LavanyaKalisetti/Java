/*
 * Choose the correct output of the following code
     A.	google Inform Techno Naresh
     B.	Techno  google Naresh Inform 
     C.	google Naresh Techno Inform 
     D.	google Naresh Inform Techno
 */
package com.nit.mcqs;

import java.util.ArrayList;

public class MCQ7{
	public static void main(String[] args) 
         {
		ArrayList<String> al = new ArrayList<>();
		al.add("google");
		al.add("Naresh");
		al.add("Information");
		al.add("Technology");
		for(int i=0;i<al.size();i++) 
		{
			System.out.print(al.get(i).substring(0,6)+" ");
		}
	}
}
/*
 * Output: D. google Naresh Inform Techno
 */
