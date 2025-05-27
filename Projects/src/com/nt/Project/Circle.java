package com.nt.Project;

public class Circle {

	    double radius;

	   
	    public Circle() {
	        this.radius = 1.0; 
	    }

	    
	    public Circle(double radius) {
	        if (radius <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	        }
	        this.radius = radius;
	    }

	    
	    public double getArea() {
	        if (radius < 0) {
	            return -1;
	        }
	        return Math.PI * radius * radius;
	    }
	}

	
	class Cylinder extends Circle {
	    double height;

	    
	    public Cylinder() {
	        super(); 
	        this.height = 1.0;
	    }

	    
	    public Cylinder(double radius, double height) {
	        super(radius); 
	        if (height <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	        }
	        this.height = height;
	    }

	   
	    public double getVolume() {
	        if (height < 0) {
	            return -1;
	        }
	        return getArea() * height;
	    }
	}

