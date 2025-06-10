/*
 * WAP to display the names which start with A and their length > 4
 */

package com.nt.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {
	public static void main(String args[]) {
	List<String> names=Arrays.asList("Aradhya","Sreyan","Lekhan","Aman",
			                         "Nainika","Abhilash","Ajay","Akanksha");
	List aName4=names.stream().filter(str->str.startsWith("A")
			                          && str.length()>4).collect(Collectors.toList());
	 System.out.println(aName4);
}
}