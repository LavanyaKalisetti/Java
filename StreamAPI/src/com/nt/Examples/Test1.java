package com.nt.Examples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {
	public static void main(String args[]) {
		int arr[]= {10,30,50,30,100,70,90};
		IntStream s=Arrays.stream(arr);
		s.forEach(System.out::println);
		
		String course[]= {"Java","Python","c","DSA","Devops",".net"};
		Arrays.stream(course).forEach(System.out::println);
	}

}
