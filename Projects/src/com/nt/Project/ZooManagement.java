package com.nt.Project;

	public class ZooManagement {
	    public static void main(String[] args) {
	        // Lion Test
	        System.out.println("Lion Details:");
	        Lion lion = new Lion("Simba", 5, 20);
	        lion.displayInfo();
	        lion.makeSound();
	        lion.displayManeLength();

	        System.out.println();

	        // Elephant Test
	        System.out.println("Elephant Details:");
	        Elephant elephant = new Elephant("Jumbo", 10, 2.5f);
	        elephant.displayInfo();
	        elephant.makeSound();
	        elephant.displayTuskLength();
	    }
	}



