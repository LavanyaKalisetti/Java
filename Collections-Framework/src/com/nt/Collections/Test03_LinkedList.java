package com.nt.Collections;

import java.util.LinkedList;

public class Test03_LinkedList {
public static void main(String[] args) {
		
		//1. Creating collection object
		LinkedList<Object> al = new LinkedList<>();
		
		//2. Finding capacity, size and printing Vector elements
		
		//System.out.println(al.capacity());
		System.out.println(al.size());
		System.out.println(al);
		System.out.println();
		
		//3. adding objects to Vector
		al.add("a");
		al.add("b");
		al.add(5);
		al.add(6.7);
		al.add('a');
		al.add(true);
		al.add(null);
		al.add("a");
		al.add(null);
		al.add(5);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println();
		
		al.add(6.7);
		al.add(new Ex(5, 6));
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println();
		
		//4. Retrieving objects randomly 
		System.out.println(al.get(0));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println(al.get(10));
		System.out.println();

		//5. Retrieving objects sequentially
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		//6.Searching for object in collection (internally == operator equals() method are used)
		System.out.println(al.contains("a")); //String("a").equals(ele[i])
		System.out.println(al.contains(6.7)); //Double(6.7).equals(ele[i])
		System.out.println(al.contains("A")); //String("A").equals(ele[i])	
		System.out.println(al.contains(null)); //null==ele[i])	
		
	}

}
