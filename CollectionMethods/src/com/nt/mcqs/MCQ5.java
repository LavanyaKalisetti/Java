/*
 * What will be the output of the following Java code?
 */
package com.nt.mcqs;

import java.util.Vector;
public class MCQ5{
    public static void main(String[] args) 
    {
        Vector<String> v1 = new Vector<>();
        Vector<String> v2 = new Vector<>();

        v1.add("Java");
        v1.add("Technology");

        v2.add("Java");
        v2.add("Technology");

        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
    }
}
/*
Output:
true
385486571
385486571
*/
