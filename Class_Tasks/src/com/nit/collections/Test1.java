/*
 * write a java program to create an array  list, add some animal (Strings)
 * and print out the collection.
 * TestCase:
 * ---------
 * print animals present in the array in same line with same space between the 
 * animals name
 */

package com.nit.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String args[]) {
		ArrayList<String> animals=new ArrayList<>();
		animals.add("Monkey");
		animals.add("donkey");
		animals.add("fox");
		animals.add("dog");
		animals.add("Tiger");
		animals.add("Lion");
		
		//1)printing the names directly with reference
		System.out.println(animals);
		System.out.println();
		
		//2)printing names by using for loop
		for(int i=0;i<animals.size();i++) {
			System.out.println(animals.get(i)+"");
		 }
		System.out.println();
	
		//3)printing names using extending for loop/enhanced for loop
	    for(String animal: animals) {
		System.out.println(animal+" ");
	   }
	    System.out.println();
	  
	  //4)printing names by forEach()
	  animals.forEach(str->System.out.print(str+" "));
	  System.out.println();
	  
	  
	  //5)printing names bt using Iterator
	  Iterator<String> itr=animals.iterator();
	  while(itr.hasNext()) {
		  String str=itr.next();
		  System.out.println(str+"");
	  }
	  System.out.println();
	  
	  //6)printing using by ListIterator
	  ListIterator<String> ltr=animals.listIterator();
	  while(ltr.hasNext()) {
		  String str=ltr.next();
		  System.out.println(str+"");
	  }
	  System.out.println();
	  
	  //7)printing using by StreamAPI
	  Stream<String> stream=animals.stream();
	  stream.forEach(a->System.out.print(a+" "));
	  System.out.println();
	  
	  //8)printing by using SplitIterator
	  Spliterator<String> splitr=animals.spliterator();
	  splitr.forEachRemaining(an->System.out.print(an+" "));
	  System.out.println();
	  
	  //9)printing by using SplitTterator-tryAdvance
	  Spliterator<String> spl=animals.spliterator();
	  while(spl.tryAdvance(a->System.out.print(a))){
		  System.out.print(" ");
	  }
	  }
}
