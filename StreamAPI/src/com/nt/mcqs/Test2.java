/*Q2.Choose the correct output for following code Snippet?
 A] [16]
 B] [13]
 c] Optional[16]
 D] []
 */
package com.nt.mcqs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test2 {
public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>();
list.add(12);
list.add(13);
list.add(16);
list.add(14);
Optional<Integer> max = list.stream().max((x, y) -> x.compareTo(y));
System.out.println(max);
}
}

//OutPut: c] Optional[16]