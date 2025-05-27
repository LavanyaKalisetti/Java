package com.nt.UMS;

public class Student extends Person {
    protected String rollNumber;
    protected String course;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}
