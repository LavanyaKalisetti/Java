/*
 * Q3.Choose the correct output for following code Snippet?
 
 A] [1, 2, 3, 4]
 B] [1, 2, 3]
 c] [4, 5, 6]
 D] [4]
 
 */
package com.nt.mcqs;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
public static void main(String[] args) {
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
al.add(6);
List<Integer> list = al.stream().limit(4).toList();
System.out.println(list);
}
}

//Output: A] [1, 2, 3, 4]
