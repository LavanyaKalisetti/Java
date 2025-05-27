/*
 Ways to Read Input from Console in Java-Four ways:
 
 1. Using Buffered Reader Class:-
 -----------------------------------
    Buffered Reader Class is the classical method to take input,
    Introduced in JDK 1.0. This method is used by wrapping the System.in (standard input stream) 
    in an InputStreamReader which is wrapped in a BufferedReader, 
    we can read input from the user in the command line. 

   -The input is buffered for efficient reading.
   -The wrapping code is hard to remember.
 */

package com.gfg.basic;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Example1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		String s=br.readLine();
		System.out.println("Enter the String:"+s);
		
	}

}
