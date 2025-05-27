package com.nt.Arrays;

import java.util.Arrays;

public class Test07_ArrayOfClassObjects_staticway {
public static void main(String[] args) {
		
		//Creating Student objects
		Student s1 = new Student(101, "S1", "C1", 3000);
		Student s2 = new Student(102, "S2", "C1", 3000);
		Student s3 = new Student(103, "S3", "C1", 3000);
		Student s4 = new Student(104, "S4", "C1", 3000);
		Student s5 = new Student(105, "S5", "C1", 3000);
		
//==================================================================	
		//Creating Array object and storing Student objects in this array
		Student[] sa = {s1, s2, s3, s4, s5};  //static way 
		System.out.println(sa);
//==================================================================		
		System.out.print(sa[0]);
		System.out.print(sa[1]);
		System.out.print(sa[2]);
		System.out.print(sa[3]);
		System.out.print(sa[4]);
		System.out.println();
//==================================================================		
		System.out.println(Arrays.toString(sa));
		System.out.println();
//==================================================================		
		for(int i=0; i<sa.length; i++) {
			System.out.print(sa[i]);
		}
		System.out.println();
//==================================================================		
		for(Student s : sa) {
			System.out.print(s);
		}
		System.out.println();
//==================================================================		
		Arrays.stream(sa).forEach(s -> System.out.print(s));
		System.out.println();
//==================================================================		
		Arrays.stream(sa).forEach(System.out::print);
		System.out.println();
		System.out.println();
//==================================================================
		//Array object creation with new kw and size
		Student[] sa2 = new Student[5];				//static nature code 
//==================================================================
		System.out.println(Arrays.toString(sa2));
//==================================================================
		//Storing Student objects in array 

		sa2[0] = new Student(101, "S1", "C2", 4000);  //static values
		System.out.println(Arrays.toString(sa2));
		
		sa2[1] = new Student(102, "S2", "C2", 4000);
		System.out.println(Arrays.toString(sa2));
		
		sa2[2] = new Student();
		System.out.println(Arrays.toString(sa2));
		
//==================================================================
		sa2[2].setSno(103);
		sa2[2].setSname("S3");
		sa2[2].setCourse("C2");
		sa2[2].setFee(4000);
//==================================================================
		System.out.println(Arrays.toString(sa2));
//==================================================================
 /**/	
 
	}

}
