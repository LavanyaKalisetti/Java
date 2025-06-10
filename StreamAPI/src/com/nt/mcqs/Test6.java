/*
 * Q6.Choose the correct output for following code Snippet?
  
   A] 4 5 6 7 8 
   B] 4 8 12 16 20 
   c] 8 7 6 5 4
   D] No output
 */

package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;

public class Test6 {
public static void main(String[] args) {
List<Integer> list = Arrays.asList(1,2,3,4,5);
list.stream().map(k -> k*2+3-k).forEach(k -> System.out.print(k +" "));
}
}

//Output: A] 4 5 6 7 8