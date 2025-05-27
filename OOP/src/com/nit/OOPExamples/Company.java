package com.nit.OOPExamples;

public class Company {
	public static void main(String [] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.eno=1001;
		e1.ename="LekhanAditya";
		e1.department="Developer";
		e1.salary=30000;
		
		e2.eno=2001;
		e2.ename="Nivedika";
		e2.department="Associate";
		e2.salary=40000;
		
		System.out.println("e1 Object values");
		System.out.println("e1.eno\t\t:"+e1.eno);
		System.out.println("e1.ename\t:"+e1.ename);
		System.out.println("e1.department\t:"+e1.department);
		System.out.println("e1.salary\t:"+e1.salary);
		
		System.out.println();
		
		System.out.println("e2 Object values");
		System.out.println("e2.eno\t\t:"+e2.eno);
		System.out.println("e2.ename\t:"+e2.ename);
		System.out.println("e2.department\t:"+e2.department);
		System.out.println("e2.salary\t:"+e2.salary);
		
	}

}
