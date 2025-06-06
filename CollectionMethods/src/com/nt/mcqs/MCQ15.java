//What will be the output of the following Java code?
package com.nt.mcqs;

import java.util.ArrayList;
public class MCQ15 {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<>();
 list.add("12");
 list.add("16");
 list.add("34");
 list.add("78");
 list.remove(Integer.valueOf(16));
 System.out.println(list);
 }
}
//Output:[12, 16, 34, 78]