/*
 * Q15.Choose the correct output for following code Snippet?
 
  A] [BC, CDE, DEFG]
  
  B] [DEFG, CDE, BC]

  c] [CDE, DEFG]

  D] []
  
 */

package com.nt.mcqs;

import java.util.ArrayList;
import java.util.List;

public class Test15 {
public static void main(String[] args) {
ArrayList<String> al = new ArrayList<String>();
al.add("A");
al.add("BC");
al.add("CDE");
al.add("DEFG");
List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
System.out.println(list);
}
}

//Output: A] [BC, CDE, DEFG]
