package com.nt.Project;

public class Tester_FMS {
	    public static void main(String[] args) {

	        // 1. Student
	    	Student_FMS s1 = new Student_FMS(1, "John Smith", 25000.0);
	        System.out.println(s1.displayDetails());
	        double remaining1 = s1.payFee(25000.0);
	        if (remaining1 > 0) {
	            System.out.println("Remaining amount to pay is: " + remaining1);
	        } else {
	            System.out.println("All Fees are clear");
	            System.out.println();
	        }

	        // 2. DayScholar
	        DayScholar ds1 = new DayScholar(2, "Brian Lara", 25000.0, 5000.0);
	        System.out.println(ds1.displayDetails());
	        double remaining2 = ds1.payFee(25000.0);
	        if (remaining2 > 0) {
	            System.out.println("Remaining amount to pay is: " + remaining2);
	            System.out.println();
	        } else {
	            System.out.println("All Fees are clear");
	            System.out.println();
	        }

	        // 3. Hosteller
	        Hosteller h1 = new Hosteller(3, "Virat Kohli", 25000.0, 8000.0);
	        System.out.println(h1.displayDetails());
	        double remaining3 = h1.payFee(33000.0);
	        if (remaining3 > 0) {
	            System.out.println("Remaining amount to pay is: " + remaining3);
	        } else {
	            System.out.println("All Fees are clear");
	        }
	    }
	  }
