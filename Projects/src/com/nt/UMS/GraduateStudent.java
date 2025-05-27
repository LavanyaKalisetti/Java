package com.nt.UMS;

public class GraduateStudent extends Student {
    private String specialization;
    private double gpa;

    public GraduateStudent() {
        super();
    }

    public GraduateStudent(String name, int age, String rollNumber, String course, String specialization, double gpa) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
        this.specialization = specialization;
        setGpa(gpa); // uses validation
    }

    public GraduateStudent(String name, int age) {
        super(name, age);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA. GPA must be between 0.0 and 4.0.");
        }
    }

    public void displayGraduateStudentInfo() {
        displayStudentInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("GPA: " + gpa);
    }

    public void validateGPA() {
        if (gpa < 3.0) {
            System.out.println("GPA below required threshold");
        } else {
            System.out.println("GPA is acceptable");
        }
    }
}
