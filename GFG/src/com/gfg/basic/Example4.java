/*
 4. Using Command line argument:-
 --------------------------------
   Command line argument has been around since JDK 1.0
   and are used in competitive coding. 
   These inputs are passed to the program during execution 
   and are stored as strings in the args[] array. 
   If we need numeric values, we can convert the strings using methods 
   like Integer.parseInt() or Float.parseFloat().
   These programs are run from the command line, with inputs provided
   while executing the program.
 */
package com.gfg.basic;

public class Example4 {
	public static void main(String[] args) {
		if(args.length>0) {
			System.out.println("The command line arguments are:");
			for(String val:args) 
				System.out.println(val);
			}
		else 
				System.out.println("No command line " + "arguments found.");
			
		}
	}


