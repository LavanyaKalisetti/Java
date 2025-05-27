package com.nt.Project;

public class Student {
	
	    protected String name;
	    protected int rollNumber;

	    
	    public Student(String name, int rollNumber) {
	        if (rollNumber <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	        }
	        this.name = name;
	        this.rollNumber = rollNumber;
	    }

	    
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	    }

	    
	    public double calculatePercentage() {
	        return 0.0; 
	    }
	}

	
	class ScienceStudent extends Student {
	    private int physicsMarks;
	    private int chemistryMarks;
	    private int mathMarks;

	    
	    public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
	        super(name, rollNumber);
	        if (physicsMarks <= 0 || chemistryMarks <= 0 || mathMarks <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	        }
	        this.physicsMarks = physicsMarks;
	        this.chemistryMarks = chemistryMarks;
	        this.mathMarks = mathMarks;
	    }

	    
	    @Override
	    public void displayDetails() {
	        System.out.println("Science Student Details:");
	        super.displayDetails();
	        System.out.println("Physics Marks: " + physicsMarks);
	        System.out.println("Chemistry Marks: " + chemistryMarks);
	        System.out.println("Math Marks: " + mathMarks);
	    }

	    
	    @Override
	    public double calculatePercentage() {
	        double total = physicsMarks + chemistryMarks + mathMarks;
	        return total / 3.0;
	    }
	}

	
	class ArtsStudent extends Student {
	    private int historyMarks;
	    private int geographyMarks;
	    private int englishMarks;

	    
	    public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
	        super(name, rollNumber);
	        if (historyMarks <= 0 || geographyMarks <= 0 || englishMarks <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	        }
	        this.historyMarks = historyMarks;
	        this.geographyMarks = geographyMarks;
	        this.englishMarks = englishMarks;
	    }

	    
	    @Override
	    public void displayDetails() {
	        System.out.println("Arts Student Details:");
	        super.displayDetails();
	        System.out.println("History Marks: " + historyMarks);
	        System.out.println("Geography Marks: " + geographyMarks);
	        System.out.println("English Marks: " + englishMarks);
	    }

	    
	    @Override
	    public double calculatePercentage() {
	        double total = historyMarks + geographyMarks + englishMarks;
	        return total / 3.0;
	    }
	}

	
	