/*
 * Q14.Choose the correct output for following code Snippet?
 
   A) No output
   B) NullPointer Exception
   C) NULL
   D) Compilation Error
   
 */

package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;

public class Test14 {
public static void main(String[] args) {
List<String> words = Arrays.asList();
String result = words.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + s2).orElse("NULL");
System.out.println(result);
}
}

//Output: C) NULL
