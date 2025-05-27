/*
 Java BufferedOutputStream Class:-
 -----------------------------------
 BufferedOutputStream class in Java is a part of the java.io package.
 It improves the efficiency of writing data to an output stream by buffering the data.
 This reduces the number of direct writes to the underlying output stream,
 making the process faster and more efficient. 
 */
package com.gfg.basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;

public class BOS {
	public static void main(String args[]) throws IOException {
		String s="This is the example of BufferdOutputStream";
		
		try(FileOutputStream fis=new FileOutputStream("output.txt");
			BufferedOutputStream bis = new BufferedOutputStream(fis)){
			
			bis.write(s.getBytes());
			System.out.println("Successfully!");
		}
		catch(IOException e) {
		e.printStackTrace();
	}
	
	}
}
