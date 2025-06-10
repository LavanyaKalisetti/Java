/*
  Q17.Choose the correct output for following code Snippet?

  A] 23 3 

  B] 3 23

  c] 364 234 54 34 

  D] 34 54 234 364
  
 */

package com.nt.mcqs;

import java.util.Comparator;
import java.util.List;

public class Test17 {
public static void main(String[] args) {
Comparator<Integer> comparator = new Comparator<Integer>() {
public int compare(Integer o1, Integer o2) {
return o2.compareTo(o1);
}
};
List<Integer> list = List.of(54,34,234,23,364,3);
list.stream().sorted(comparator).filter(k -> k%2 == 1).forEach(k -> System.out.print(k + " "));
}
}

//Output: A] 23 3 