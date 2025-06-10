/*
 * Q13.Choose the correct output for following code Snippet?
   
    A] [A, B, C, D]
    B] [B]
    c] [A, C, D]
    D] No output
    
 */

package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;

public class Test13 {
public static void main(String[] args) {
List<String> al = Arrays.asList("A", "B", "C", "D");
List<String> list = al.stream().skip(1).filter(x -> x.startsWith("B")).peek(x -> {}).toList();
System.out.println(list);

}
}

//Output:B] [B]