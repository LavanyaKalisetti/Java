package com.nt.variables;

public class Test {
	public static void main(String[] args) {
		Example e1=new Example();
		Example e2=new Example();
		
		e1.Setx(10);
		e1.Sety(20);
		e2.Setx(30);
		e2.Sety(40);
		
		System.out.println(e1.getx()+""+e1.gety());
		System.out.println(e2.getx()+""+e2.gety());
		
		e1.Setx(15);
		e1.Sety(16);
		e2.Setx(18);
		e2.Sety(19);
		
		e1.display();
		e2.display();
		
	}

}
