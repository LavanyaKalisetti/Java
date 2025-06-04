package com.nt.Examples;

import java.util.regex.Pattern;

public class Test4 {
	public static void main(String args[]) {
		//Create a stream using splitasStream()
		String sentence="puspanjali I Love you to the Moon and Back";
		Pattern.compile(",").splitAsStream(sentence).forEach(System.out::println);;
	}

}
