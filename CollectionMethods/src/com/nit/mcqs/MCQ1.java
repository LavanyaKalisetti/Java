/*
 * 1.What is the output of the following code
   A.	progress NareshIT goolge nareshIT
   B.	goolge progress NareshIT nareshIT 
   C.	progress NareshIT nareshIT goolge
   D.	progress goolge NareshIT nareshIT 


 */
package com.nit.mcqs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MCQ1{
	public static void main(String[] args){
		List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
		Collections.reverse(list);
		for(String str: list)
			System.out.print(str+" ");
	}
}
/*
 Output: C.progress NareshIT nareshIT goolge 
 */