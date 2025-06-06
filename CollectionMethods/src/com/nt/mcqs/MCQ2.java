/*
 * What will be the output of the following Java code?
 */
package com.nt.mcqs;

import java.util.*;
class MCQ2{
 public static void main(String args[]) 
 {
   Vector obj = new Vector(4,2);
  obj.addElement(new Integer(3));
obj.addElement(new Integer(2));
 obj.addElement(new Integer(5));
 System.out.println(obj.capacity());
 }
 }

/*
    Output: 4
*/