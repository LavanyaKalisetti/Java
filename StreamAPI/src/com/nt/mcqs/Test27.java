/*
  Q27.Choose the correct output for following code Snippet?
  
      A] [[a], [b], [c], [d]]

      B] [a, b, c, d]

      c] [[a, b], [c, d]]

      D] Compile time Error

 */


package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test27{ 
	public static void main(String[] args){
List<List<String>> data = Arrays.asList(
Arrays.asList("a", "b"),
Arrays.asList("c", "d"));

List<String> result = data.stream()
.flatMap(List::stream)
.collect(Collectors.toList());

System.out.println(result);

}
}

//Output: B] [a, b, c, d]