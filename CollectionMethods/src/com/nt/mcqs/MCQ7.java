/*
 * What will be the output of the following Java code?
 */
package com.nt.mcqs;

import java.util.ArrayList;
import java.util.List;
public class MCQ7{
public static void main(String[] args)
{
 List<String> list = new ArrayList<String>();
 list.add("Patna");
 list.add(0, "New York");
 list.add("Mumbai");
 list.add(2, "Sydney");
 System.out.println(list);
 }
}

/*
 Output: [New York, Patna, Sydney, Mumbai]
 */
