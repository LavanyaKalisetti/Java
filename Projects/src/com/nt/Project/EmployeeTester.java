package com.nt.Project;

import java.util.ArrayList;

public class EmployeeTester {
	    public static void main(String[] args) {
	        ArrayList<Employee> empList = new ArrayList<>();

	        // Employee 1
	        Employee e1 = new Employee();
	        e1.setEmployeeName("Sreyan");
	        e1.setDepartment("HR");
	        e1.setBaseSalary(50000);
	        e1.setPerformanceScore(9);

	        // Employee 2
	        Employee e2 = new Employee();
	        e2.setEmployeeName("Lekhan");
	        e2.setDepartment("Finance");
	        e2.setBaseSalary(60000);
	        e2.setPerformanceScore(6);

	        // Employee 3
	        Employee e3 = new Employee();
	        e3.setEmployeeName("Ajay");
	        e3.setDepartment("IT");
	        e3.setBaseSalary(55000);
	        e3.setPerformanceScore(3);

	        empList.add(e1);
	        empList.add(e2);
	        empList.add(e3);

	        //  Bonus Details
	        for (Employee emp : empList) {
	            try {
	                double bonus = emp.calculateBonus();
	                System.out.println("Employee Name: " + emp.getEmployeeName());
	                System.out.println("Department: " + emp.getDepartment());
	                System.out.println("Base Salary: $" + emp.getBaseSalary());
	                System.out.println("Calculated Bonus: $" + bonus);
	                System.out.println("");
	            } catch (InvalidInputException ex) {
	                System.out.println("Error calculating bonus for " + emp.getEmployeeName() + ": " + ex.getMessage());
	            }
	        }
	    }
	}



