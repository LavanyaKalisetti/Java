/*
  Q21.Choose the correct output for following code Snippet?

      A] [9, 10]

      B] [11, 12]

      c] Runtime Exception

      D] []
      
 */

package com.nt.mcqs;

import java.util.ArrayList;
import java.util.List;

public class Test21 {
public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(9);
al.add(10);
al.add(11);
al.add(12);
List<Integer> list = al.stream().takeWhile(x->x<=10).toList();
System.out.println(list);
}
}

//Output: A] [9, 10]
