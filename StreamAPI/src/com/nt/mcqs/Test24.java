/*
 * Q24.Choose the correct output for following code Snippet?

       A] [[1],[2],[3],[4],[5]]

       B] [1, 2, 3, 4, 5]

       c] Runtime Exception 

       D] No Output

 */

package com.nt.mcqs;

import java.util.Arrays;
import java.util.List;

public class Test24 {
public static void main(String[] args) {
List<List<String>> list= Arrays.asList(Arrays.asList("1","2","3","4","5"));
list.stream().flatMap(x -> list.stream())
.forEach(System.out::print);
}
}

//Output: B] [1, 2, 3, 4, 5]
