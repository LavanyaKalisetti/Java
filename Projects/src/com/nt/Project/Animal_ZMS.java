package com.nt.Project;

public class Animal_ZMS {
	
	    private String name;
	    private int age;

	    public Animal_ZMS(String name, int age) {
	        if (age <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	        }
	        this.name = name;
	        this.age = age;
	    }

	    public void makeSound() {
	        System.out.println("The animal makes a generic sound.");
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

 class Lion extends Animal_ZMS {
    private int maneLength;

    public Lion(String name, int age, int maneLength) {
        super(name, age);
        if (maneLength <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.maneLength = maneLength;
    }

    @Override
    public void makeSound() {
        System.out.println("The lion roars loudly.");
    }

    public void displayManeLength() {
        System.out.println("Mane Length: " + maneLength + " cm");
    }
}
 
  class Elephant extends Animal_ZMS  {
     private float tuskLength;

     public Elephant(String name, int age, float tuskLength) {
         super(name, age);
         if (tuskLength <= 0) {
             System.out.println("Error Invalid Input");
             System.exit(0);
         }
         this.tuskLength = tuskLength;
     }

     @Override
     public void makeSound() {
         System.out.println("The elephant trumpets.");
     }

     public void displayTuskLength() {
         System.out.println("Tusk Length: " + tuskLength + " meters");
     }
 }


 
