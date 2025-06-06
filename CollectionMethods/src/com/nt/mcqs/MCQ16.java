// What is the output of the following code.

package com.nt.mcqs;

import java.util.*;
public class MCQ16{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        List<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");

        System.out.println(list.equals(vector));
    }
}
//Output: true
