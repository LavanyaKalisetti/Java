package com.nt.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
	public static void main(String args[]) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("Collection Created.");
		System.out.println("Collection is Empty."+a1.isEmpty());
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(400);
		a1.add(500);
		System.out.println("Elements are added into Collection.");
		
		//size(): check the number of elements in collection
		System.out.println("No. of Elements:"+a1.size());
		
		//isEmpty():check whether collection contains any element
		System.out.println("Collection is Empty:"+a1.isEmpty());
		
		//contains:check whether the passes object is available in memory
		System.out.println("Elements 200 is available ."+a1.contains(200));
		System.out.println("Elements 500 is available ."+a1.contains(500));
		
		//iterator():used to create cursor object and traverse through the collection
		Iterator itr=a1.iterator();
		System.out.println("Elements in collection are:");
		while(itr.hasNext()) {
			Integer obj= (Integer)itr.next();
			System.out.println(obj);
		}
		Object arr[]=a1.toArray();
		for(Object o: arr) {
			System.out.println(o);
		}
		
		//remove(int index): remove object from collection based on index if available
		System.out.println("Removing element at index 0:");
		//a1.remove(9); IOBE
		System.out.println(a1);
		
		//remove(Object o): remove object from collection based on passed object if available
		System.out.println("Removing object 400:");
		a1.remove(new Integer(400));
		System.out.println(a1);
		
		ArrayList<Integer> a12=new ArrayList<Integer>();
		a12.add(101);
		a12.add(202);
		a12.add(303);
		a12.add(404);
		a12.add(505);
		System.out.println("Elements in a1:"+ a1);
		System.out.println("Elements in a12:"+ a12);
		System.out.println("Adding all elements of a12 into a1");
		a1.addAll(a12);
		System.out.println("Elements in a1:"+a1);
		System.out.println("Elements in a12:"+a12);

		//containsAll(): check whether a collection contains all elements of another collection
		System.out.println("a1 contains all elements of a12:"+a1.containsAll(a12));
		System.out.println("Removing an element(101) of a12 from a1.");
		a1.remove(new Integer(10));
		System.out.println("Elements in a1:"+a1);
		System.out.println("a1 contains all elements of a12:"+a1.containsAll(a12));
		System.out.println("Elements in a1:"+a1);
		System.out.println("Elements in a12:"+a12);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
