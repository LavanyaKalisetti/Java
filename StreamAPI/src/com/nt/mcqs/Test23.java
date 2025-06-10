/*
  Q22.Choose the correct output for following code Snippet?
  
  A] 90 90 90 90 90 90 

  B] 234 364

  c] 54 34 23 3

  D] 3 23 34 54

 */

package com.nt.mcqs;

import java.util.*;
public class Test23 {
public static void main(String[] args) {
List<Integer> list = List.of(54,34,234,23,364,3);
list.stream().map(k -> k-k+2).filter(k -> k!=0).map(k -> 100)
.forEach(k -> System.out.print(k - 10 + " "));
}
}

//Output: A] 90 90 90 90 90 90 