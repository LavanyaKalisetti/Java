/*
4)FilterEmployeeBySalary
Create a record of Employee with attributes name:(String) and id:(String)
Given a list of Employee objects with name and salary properties, write a program to filter the list of Employees by salary in who are having salary > 30000 and print the employee names.
 */



package com.nt.streamapi;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class FilterEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25000));
        employees.add(new Employee("Alice", 35000));
        employees.add(new Employee("Bob", 40000));
        employees.add(new Employee("Charlie", 20000));

        employees.stream()
                .filter(employee -> employee.getSalary() > 30000)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
