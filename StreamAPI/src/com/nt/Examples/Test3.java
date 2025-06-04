package com.nt.Examples;

import java.util.stream.Stream;

public class Test3 {
	public static void main(String args[]) {
		//Creating stream by using generate()
		Stream <Double> randomNumbers = Stream.generate(Math::random).limit(10);
		randomNumbers.forEach(System.out::println);
	}	

}
