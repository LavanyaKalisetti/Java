package com.nt.functinalProgramming;

import java.util.*;
import java.util.function.*;

class Employee {
    String name;
    double salary;
    double rating;

    Employee(String name, double salary, double rating) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }
}

public class SmartHRSystem {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Anjali", 40000, 4.2),
            new Employee("Rohit", 37500, 4.0),
            new Employee("Neha", 42000, 3.2),
            new Employee("Kiran", 39000, 2.9)
        );

        Predicate<Employee> isEligibleForBonus = emp -> emp.rating >= 4.0;

        Function<Employee, Double> calculateBonus = emp -> emp.salary * 0.20;

        Supplier<String> systemMessage = () -> "HR SYSTEM: Bonus processing completed!";

        Consumer<String> notify = message -> System.out.println("Notification Sent: " + message);

        for (Employee emp : employees) {
            if (isEligibleForBonus.test(emp)) {
                double bonus = calculateBonus.apply(emp);
                String message = emp.name + ", congratulations! You’ve received a bonus of ₹" + bonus;
                notify.accept(message);
                System.out.println();
            } else {
                System.out.println(emp.name + " is not eligible for a bonus.");
                System.out.println();
            }
        }

        System.out.println(systemMessage.get());
        System.out.println();
    }
}
