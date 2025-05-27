/*
 5. Using DataInputStream Class:-
 ---------------------------------
    DataInputStream class in Java, introduced in JDK 1.0, 
    is used to read primitive data types like int, float, boolean, and strings 
    from an input stream in a way that works across different machines. 
    It is part of the java.io package and wraps an existing input stream. 
    It’s commonly used with DataOutputStream or similar sources to ensure the data
    is read correctly. 
 */
package com.gfg.basic;

import java.io.DataInputStream;
import java.io.IOException;
//import java.io.DataOutputStream;

public class Example5 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the Integer:");
		int i=Integer.parseInt(dis.readLine());
		System.out.println("Enter the String:");
		String s=dis.readLine();
		System.out.println("You Entered the Integer is"+"\s"+i);
		System.out.println();
		System.out.println("You Entered the String is"+"\s"+s);
	}

}
