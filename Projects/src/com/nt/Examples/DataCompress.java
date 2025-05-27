/*
 * A sensor records 10 readings per cycle. To reduce storage, we want to compress the
   data by adding pairs of consecutive readings and store them in a smaller array
   of size 5. Display the compressed result.
 */
package com.nt.Examples;

public class DataCompress {
	public static void main(String[] args) {
		int readings[]={10, 12, 15, 13, 9, 11, 14, 16, 8, 10};
		int compressed[]=new int[5];
		
		for (int i = 0; i < 5; i++) {
            compressed[i] = readings[2 * i] + readings[2 * i + 1];
        }
		System.out.println("Compressed Sensor Data:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Adding pairs of consecutive readings " + (i + 1) + ": " + compressed[i]);
	}
  }
}

