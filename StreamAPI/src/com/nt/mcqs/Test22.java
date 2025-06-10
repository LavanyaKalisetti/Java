/*
   Q22.Choose the correct output for following code Snippet?
   
   A] 1

   B] apple

   c] 2

   D] 0

 */

package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;

public class Test22 {
public static void main(String[] args) {
List<String> words = Arrays.asList("apple", "banana", "cherry");
long count = words.stream()
.map(String::toUpperCase)
.filter(s -> s.startsWith("A"))
.count();
System.out.println(count);
}
}

//Output: A] 1