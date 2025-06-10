/*
 * Q11.Choose the correct output for following code Snippet?

   A] [12, 13, 114]
   B] [12, 12, 13, 114]
   C] [114, 12, 13]
   D] [13, 114]
 */

package com.nt.mcqs;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>();
list.add(12);
list.add(13);
list.add(12);
list.add(114);
List<Integer> list2 = list.stream().distinct().toList();
System.out.println(list2);
}
}

//Output: A] [12, 13, 114]
