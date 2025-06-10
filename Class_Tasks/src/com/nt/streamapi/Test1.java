/* WAP to filter out the even numbers from an ArrayList.
   Collect them into a List and Display
   NOTE:
   1.Array of Elements are represented as a List by the help of asList()
   2.we can collect elements from a filtered group of elements by the help of collect().
   3.we can represent collected elements as a List by the support of Collectors.toList().
*/
package com.nt.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String args[]) {
		//representing array of elements as List
		List<Integer> number=Arrays.asList(10,20,21,24,76,75,19);
		
		//created a stream ,filtered the elements based on condition,
		//collected the elements and reprresented as List
		List<Integer> result=number.stream().filter(n-> n%2==0).collect(Collectors.toList());
		//result.forEach(System.out::println);
		System.out.println("Even Numbers are: "+result);
		}

}
