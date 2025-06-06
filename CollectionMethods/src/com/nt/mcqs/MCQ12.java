//What will be the output of the following Java code?
package com.nt.mcqs;

import java.util.ArrayList;
public class MCQ12 {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<String>();
 list.add(null);
 list.add(0, "A");
 list.add(null);
 list.add(2, "B");
 list.add("20");
 list.add(1, "C");
 System.out.println(list);
 }
}
//Output:[A,C,null,B,null,20]
