/*
1)StudentFilter
You have a Student record with the following fields:
name : (String)
course : (String)

Create a ELC class StudentFilter.
Given a list of Student objects, where each student is enrolled in different courses, write a Java program to filter out the students who are enrolled in the "Java" course and print their names using the forEach method and the stream API.

Test Case 1:
Input:
List<Student> students =  [("Alice", "Java"),
   ("Bob", "Python"),
   ("Charlie", "Java"),
   ("David", "C++"),
   ("Eve", "JavaScript")]
Expected Output:
Alice
Charlie

Test Case 2:
Input:
List<Student> students = [("Alice", "Python"),
    ("Bob", "Python"),
    ("Charlie", "Python"),
    ("David", "C++"),
   ("Eve", "JavaScript")]
Expected Output:

Test Case 3:
Input:
List<Student> students = [
    ("Alice", "Java"),
    ("Bob", "Java"),
    ("Charlie", "Java"),
    ("David", "Java"),
    ("Eve", "Java")]
Expected Output:
Alice
Bob
Charlie
David
Eve
Sample Input
List<Student> students = [
    ("Alice", "Java"),
    ("Bob", "Java"),
    ("Charlie", "Java"),
    ("David", "Java"),
    ("Eve", "Java")]
Sample Output
Alice
Bob
Charlie
David
Eve

 */

package com.nt.streamapi;

import java.util.*;
import java.util.stream.*;

// Student class with name and course
class Student {
    private String name;
    private String course;

    // Constructor
    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for course
    public String getCourse() {
        return course;
    }
}

public class StudentFilter {
    public static void main(String[] args) {

        // Test Case 1
        List<Student> students1 = Arrays.asList(
            new Student("Alice", "Java"),
            new Student("Bob", "Python"),
            new Student("Charlie", "Java"),
            new Student("David", "C++"),
            new Student("Eve", "JavaScript")
        );
        System.out.println("Test Case 1 Output:");
        filterJavaStudents(students1);
        System.out.println();

        // Test Case 2
        List<Student> students2 = Arrays.asList(
            new Student("Alice", "Python"),
            new Student("Bob", "Python"),
            new Student("Charlie", "Python"),
            new Student("David", "C++"),
            new Student("Eve", "JavaScript")
        );
        System.out.println("Test Case 2 Output:");
        filterJavaStudents(students2);
        System.out.println();

        // Test Case 3
        List<Student> students3 = Arrays.asList(
            new Student("Alice", "Java"),
            new Student("Bob", "Java"),
            new Student("Charlie", "Java"),
            new Student("David", "Java"),
            new Student("Eve", "Java")
        );
        System.out.println("Test Case 3 Output:");
        filterJavaStudents(students3);
        System.out.println();
    }

    // Method to filter and print students enrolled in Java course
    public static void filterJavaStudents(List<Student> students) {
        students.stream()
                .filter(s -> s.getCourse().equalsIgnoreCase("Java"))
                .forEach(s -> System.out.println(s.getName()));
    }
}

