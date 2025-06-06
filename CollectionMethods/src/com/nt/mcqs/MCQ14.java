//What will be the output of the following Java code?
package com.nt.mcqs;

import java.util.ArrayList;
public class MCQ14 {
public static void main(String[] args)
{
  ArrayList<String> list = new ArrayList<>();
  list.add("a");
 list.add("b");
 list.add("c");
 list.add("d");
 list.remove("c");
 System.out.println(list);
 }
}
//Output:-[a, b, d]
