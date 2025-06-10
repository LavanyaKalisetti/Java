/*
  Q9.Choose the correct output for following code Snippet?
  
  A] 678910
  B] 44444
  C] 55555
  D] No output
 */

package com.nt.mcqs;

import java.util.List;

public class Test9 {
public static void main(String[] args) {
List<Integer> list = List.of(2, 3, 4, 5, 6);
list.stream().takeWhile(x -> x >= 0).map(x -> x * 0 + 2 + 3).peek(System.out::print).toList();
}
}

//Output: C] 55555