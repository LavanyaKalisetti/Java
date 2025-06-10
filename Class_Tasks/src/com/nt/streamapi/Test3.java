/*
 * WAP to remove the duplicate elements(String) from an ArrayList.
 */
package com.nt.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
	public static void main(String args[]) {
		List<String> names=Arrays.asList("lavanya","Sreyan","Lekhan","Nivedika","Nainika","lavanya");
		
		System.out.println("All names:"+names);
		List<String> unique=names.stream().distinct().collect(Collectors.toList());
		System.out.println("unique names:"+unique);
	}

}
