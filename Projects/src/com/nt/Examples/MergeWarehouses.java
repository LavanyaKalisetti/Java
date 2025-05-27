/* You are managing two small warehouses. Each warehouse has 5 items recorded
   in arrays A and B. You want to merge them into a central inventory array C of
   size 10 such that:
   First half (0–4): Items from Warehouse A
   Second half(5–9): Items from Warehouse B
 
 */
package com.nt.Examples;

public class MergeWarehouses {
	public static void main(String args[]) {
		int A[]= {54,77,98,67,87};
		int B[]= {65,75,54,56,86};
		int c[]=new int[10];
		
		for(int i=0;i<5;i++) {
			c[i]=A[i];
		}
		for(int i=0;i<5;i++) {
			c[i+5]=B[i];
		}
		System.out.println("central inventory array of C:");
		for(int i=0;i<10;i++) {
			System.out.println("Total Items " + (i + 1) + ": " + c[i]);
		}
	}

}
