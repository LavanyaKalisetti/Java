/*
 WAP to display alist of string by converting them to UpperCase.
 */

package com.nt.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String args[]) {
		//representing array of elements as List
		List<String> names=Arrays.asList("lavanya","Sreyan","Lekhan","Nivedika","Nainika");
           
		List<String> uc=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uc);
  }
}
