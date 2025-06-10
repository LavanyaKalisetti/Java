/*
 * Q8.Choose the correct output for following code Snippet?
 
   A] [20, 21, 22, 23]
   B] []
   c] Runtime Exception 
   D] [23, 22, 21, 20]

 */

package com.nt.mcqs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test8 {
public static void main(String[] args) {
ArrayList<Integer> arrayList = new ArrayList<Integer>();
arrayList.add(20);
arrayList.add(21);
arrayList.add(22);
arrayList.add(23);
List<Integer> collect = arrayList.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
System.out.println(collect);
}
}

//output: D] [23, 22, 21, 20]

