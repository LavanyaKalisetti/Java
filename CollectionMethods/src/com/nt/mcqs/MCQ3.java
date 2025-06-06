/*
 * What will be the output of the following Java code?
 */
package com.nt.mcqs;

import java.util.*;
class MCQ3{
 public static void main(String args[]) {
 Vector obj = new Vector(4,2);
 obj.addElement(new Integer(3));
 obj.addElement(new Integer(2));
 obj.addElement(new Integer(6));
 obj.insertElementAt(new Integer(8), 2);
 System.out.println(obj);
 } 
}

/*
     Output: [3, 2, 8, 6]
*/