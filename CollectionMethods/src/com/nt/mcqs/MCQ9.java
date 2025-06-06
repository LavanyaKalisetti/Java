/*
 * What will be the output of the following Java code?
 */
package com.nt.mcqs;

import java.util.ArrayList;
public class MCQ9{
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<String>();
 list.add(null);
 list.add(0, "A");
 list.add(3, "B");
 list.add(1, "C");
 System.out.println(list);
 }
}
/*
Output: Exception:- IndexOutOfBoundsException
*/