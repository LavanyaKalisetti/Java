package com.nt.functinalProgramming;

import java.util.*;

public class School {
    private String schoolName;
    private String location;
    private List<Faculty> facultyList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    public School(String schoolName, String location) {
        this.schoolName = schoolName;
        this.location = location;
    }

    public void addFaculty(String name, String department, String subject) {
        Faculty faculty = new Faculty(name, department, subject);
        facultyList.add(faculty);
    }

    public void getFacultyDetails(String name) {
        for (Faculty f : facultyList) {
            if (f.getName().equalsIgnoreCase(name)) {
                System.out.println("\nFaculty Details:");
                System.out.println("Name: " + f.getName());
                System.out.println("Department: " + f.getDepartment());
                System.out.println("Subject: " + f.getSubject());
                return;
            }
        }
        System.out.println("Faculty not found.");
    }

    public void enrollStudent(String name, int rollNumber, String classEnrolled) {
        Student student = new Student(name, rollNumber, classEnrolled);
        studentList.add(student);
    }

    public void getStudentDetails(String name) {
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("\nStudent Details:");
                System.out.println("Name: " + s.getName());
                System.out.println("Roll Number: " + s.getRollNumber());
                System.out.println("Class Enrolled: " + s.getClassEnrolled());
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Assign student to a class
    public void assignStudentToClass(String name, String className) {
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.classEnrolled = className;
                System.out.println("Class assigned successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    class Faculty {
        private String name;
        private String department;
        private String subject;

        public Faculty(String name, String department, String subject) {
            this.name = name;
            this.department = department;
            this.subject = subject;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String getSubject() {
            return subject;
        }
    }

    class Student {
        private String name;
        private int rollNumber;
        private String classEnrolled;

        public Student(String name, int rollNumber, String classEnrolled) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.classEnrolled = classEnrolled;
        }

        public String getName() {
            return name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getClassEnrolled() {
            return classEnrolled;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School("Sunrise Public School", "Delhi");

        school.addFaculty("Amit Sharma", "Mathematics", "Algebra");
        school.enrollStudent("Rahul Gupta", 101, "Grade 10");

        school.getFacultyDetails("Amit Sharma");
        school.getStudentDetails("Rahul Gupta");

        school.assignStudentToClass("Rahul Gupta", "Grade 11");
        school.getStudentDetails("Rahul Gupta");
    }
}

