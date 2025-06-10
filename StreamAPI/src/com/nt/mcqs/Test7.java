/*
 * Q7.Choose the correct output for following code Snippet?
  
 A] Hi Everyone All The Best!!!
   prepare
   well !!

 B] prepare
   well !!
   Hi Everyone All The Best!!!

 c] incompatible types

 D]   Hi Everyone All The Best!!!
     well !!
     prepare

 */

package com.nt.mcqs;

import java.util.ArrayDeque;

public class Test7 {
public static void main(String[] args) {
ArrayDeque<String> de = new ArrayDeque<String>();
de.push("well !!");
de.push("prepare");
System.out.println("Hi Everyone All The Best!!!");
for (Object element : de) {
System.out.println(element);
}
}
}

/*Output: A] Hi Everyone All The Best!!!
             prepare
             well !!
*/
