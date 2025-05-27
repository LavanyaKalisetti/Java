package com.nt.Project;

class Student_FMS {
    int studentId;
    String name;
    double examFee;

    public Student_FMS(int studentId, String name, double examFee) {
        if (studentId <= 0 || examFee <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.studentId = studentId;
        this.name = name;
        this.examFee = examFee;
    }

    public String displayDetails() {
        return "Student[name=" + name + ",studentId=" + studentId + ",examFee=" + examFee + "]";
    }

    public double payFee(double amount) {
        return examFee - amount;
    }

    @Override
    public String toString() {
        return displayDetails();
    }
}

class DayScholar extends Student_FMS {
    double transportFee;

    public DayScholar(int studentId, String name, double examFee, double transportFee) {
        super(studentId, name, examFee);
        if (transportFee <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.transportFee = transportFee;
    }

    @Override
    public String displayDetails() {
        return "DayScholar[TransportFee=" + transportFee + ",name=" + name + ",studentId=" + studentId + ",examFee=" + examFee + "]";
    }

    @Override
    public double payFee(double amount) {
        return (examFee + transportFee) - amount;
    }
}

class Hosteller extends Student_FMS {
    double hostelFee;

    public Hosteller(int studentId, String name, double examFee, double hostelFee) {
        super(studentId, name, examFee);
        if (hostelFee <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.hostelFee = hostelFee;
    }

    @Override
    public String displayDetails() {
        return "Hosteller[HostelFee=" + hostelFee + ",name=" + name + ",studentId=" + studentId + ",examFee=" + examFee + "]";
    }

    @Override
    public double payFee(double amount) {
        return (examFee + hostelFee) - amount;
    }
}

  