/*
 * WAP to sort a list of elements in ascending order
 */

package com.nt.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
	public static void main(String args[]) {
		List<Integer> number=Arrays.asList(10,20,21,24,76,75,19);
		
		List<Integer> decendingIntegers=number.stream().sorted(Comparator.reverseOrder()).
				                        collect(Collectors.toList());
		System.out.println(decendingIntegers);		
	}

}
