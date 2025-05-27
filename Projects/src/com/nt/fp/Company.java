package com.nt.fp;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Company{
	public static void displayIf(ArrayList<Employee> e,Predicate<Employee> p) {
		for(Employee employee : e) {
			if(p.test(employee)) {
				System.out.println(employee);
			}
		}
	}
	public static void main(String args[]){
		ArrayList<Employee> employees=new ArrayList<Employee>();
		Employee Sreyan=new Employee("Sreyan",37,600000,"Manager");
		Employee Nivedika=new Employee("Nivedika",56,670000,"HR");
		Employee Lekhan=new Employee("Lekhan",36,600000,"TeamLead");
		Employee Nainika=new Employee("Nainika",47,456700,"CEO");
		Employee Sneha=new Employee("Sneha",30,87670,"Worker");
		Employee Surya=new Employee("Surya",27,677667,"Admin");
		
		employees.add(Sreyan);
		employees.add(Nivedika);
		employees.add(Lekhan);
		employees.add(Nainika);
		employees.add(Sneha);
		employees.add(Surya);
		
		//System.out.println(employees);
		//displayIf(employees,(e)->e.getAge()<40);
		//displayIf(employees,(e)->e.getDepartment().equalsIgnoreCase("Manager"));
	    //displayIf(employees,(e)->e.getSalary()>456789);
	    //displayIf(employees, (e)->e.getName().equalsIgnoreCase("Sreyan"));
	    displayIf(employees,(e->e.getName().startsWith("S")));
	    
	}
}
