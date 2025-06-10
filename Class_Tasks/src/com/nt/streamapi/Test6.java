/*
 * WAP to display the number of elements which are greater than 50.
 */

package com.nt.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test6 {
	public static void main(String args[]) {
		List<Integer> number=Arrays.asList(10,20,21,24,76,75,19);
		long count=number.stream().filter(n->n>50).count();
        System.out.println("Number of elements greater than 50: "+count);
}
}