package com.nt.Examples;

import java.util.stream.Stream;

public class Test2 {
	public static void main(String args[]) {
		Stream stream=Stream.of("Lavanya","Sreyan","Lekhan","Nivedika","Nainika","Puspanjali");
		stream.forEach(System.out::println);
	}

}
