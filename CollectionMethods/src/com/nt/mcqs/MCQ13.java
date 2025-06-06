//What will be the output of the following Java code?
package com.nt.mcqs;

import java.util.ArrayList;
public class MCQ13{
public static void main(String[] args)
{
 ArrayList<Integer> list = new ArrayList<>();
 list.add(12);
 list.add(16);
 list.add(34);
 list.add(78);
 list.remove(12);
 System.out.println(list);
 }
}
//Output:-IndexOutOfBoundsException: Index 12 out of bounds for length 4