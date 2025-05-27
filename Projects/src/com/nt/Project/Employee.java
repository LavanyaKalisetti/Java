package com.nt.Project;

import java.util.ArrayList;

class Employee {
    private String employeeName;
    private String department;
    private double baseSalary;
    private int performanceScore;

    // Getters
    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    // Setters
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    // Calculate Bonus
    public double calculateBonus() throws InvalidInputException {
        double bonus = 0.0;
        if (performanceScore >= 1 && performanceScore <= 10) {
            if (performanceScore < 5) {
                bonus = 0.0;
            } else if (performanceScore >= 5 && performanceScore <= 7) {
                bonus = 0.10 * baseSalary;
            } else if (performanceScore >= 8 && performanceScore <= 10) {
                bonus = 0.20 * baseSalary; // <-- FIXED HERE
            }
        } else {
            throw new InvalidInputException("Invalid performance score: " + performanceScore);
        }
        return bonus;
    }
}

// Exception Class
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException() {
        super("Invalid performance score input.");
    }
}

// Main Tester Class
//public class EmployeeTester {
//    public static void main(String[] args) {
//        ArrayList<Employee> empList = new ArrayList<>();
//
//        // Employee 1
//        Employee e1 = new Employee();
//        e1.setEmployeeName("Sreyan");
//        e1.setDepartment("HR");
//        e1.setBaseSalary(50000);
//        e1.setPerformanceScore(9);
//
//        // Employee 2
//        Employee e2 = new Employee();
//        e2.setEmployeeName("Lekhan");
//        e2.setDepartment("Finance");
//        e2.setBaseSalary(60000);
//        e2.setPerformanceScore(6);
//
//        // Employee 3
//        Employee e3 = new Employee();
//        e3.setEmployeeName("Ajay");
//        e3.setDepartment("IT");
//        e3.setBaseSalary(55000);
//        e3.setPerformanceScore(3);
//
//        empList.add(e1);
//        empList.add(e2);
//        empList.add(e3);
//
//        // Print Bonus Details
//        for (Employee emp : empList) {
//            try {
//                double bonus = emp.calculateBonus();
//                System.out.println("Employee Name: " + emp.getEmployeeName());
//                System.out.println("Department: " + emp.getDepartment());
//                System.out.println("Base Salary: $" + emp.getBaseSalary());
//                System.out.println("Calculated Bonus: $" + bonus);
//                System.out.println("--------------------------");
//            } catch (InvalidInputException ex) {
//                System.out.println("Error calculating bonus for " + emp.getEmployeeName() + ": " + ex.getMessage());
//            }
//        }
//    }
//}
