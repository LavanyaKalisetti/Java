package com.nit.OOPExamples;

public class College {
	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		
		s1.sno=101;
		s1.sname="Lavanya";
		s1.Course="Java";
		s1.fee=4000;
		
		s2.sno=201;
		s2.sname="Sreyan";
		s2.Course="Oracle";
		s2.fee=3500;
		
		System.out.println("s1 Object Values");
		System.out.println("s1.sno\t:"+s1.sno);
		System.out.println("s1.sname\t:"+s1.sname);
		System.out.println("s1.Course\t:"+s1.Course);
		System.out.println("s1.fee\t:"+s1.fee);
		
		System.out.println();
		
		System.out.println("s2 Object Values");
		System.out.println("s2.sno\t:"+s2.sno);
		System.out.println("s2.sname\t:"+s2.sname);
		System.out.println("s2.Course\t:"+s2.Course);
		System.out.println("s2.fee\t:"+s2.fee);
	}
}
