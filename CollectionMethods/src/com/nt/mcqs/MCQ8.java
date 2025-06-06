/*
 * What will be the output of the following Java code?
 */

package com.nt.mcqs;

import java.util.ArrayList;
import java.util.List;
public class MCQ8{
public static void main(String[] args)
{
 List<String> list = new ArrayList<String>();
 list.add("Orange");
 list.add(0, "Banana");
 
 ArrayList<String> arList = new ArrayList<>();
 arList.add("Apple");
 list.add("Grapes");
 list.addAll(3, arList);
 System.out.println(list);
 }
}
/*
 * Output: [Banana, Orange, Grapes, Apple]
 */

