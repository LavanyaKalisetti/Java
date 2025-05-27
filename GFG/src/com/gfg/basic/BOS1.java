/*
 Program:
 The below Java program demonstrates how to use BufferedOutputStream class
 to write data to a file effectively by buffering output using methods
 like write(), flush() and close().
 */
package com.gfg.basic;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOS1 {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos=new FileOutputStream("file.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		for(int i=10;i<50;i++) {
			bos.write(i);
		}
		byte b[]= {50,55,97,67,82};
		bos.write(b);
		bos.flush();
	}

}
