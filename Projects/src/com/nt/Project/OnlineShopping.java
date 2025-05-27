package com.nt.Project;

	public class OnlineShopping {
	    public static void main(String[] args) {

	        // Electronics product
	        System.out.println("Electronics Details:");
	        Electronics e1 = new Electronics("Laptop", 1200.0, "Dell");
	        e1.displayInfo();
	        double eCost = e1.calculateTotalCost(2);
	        System.out.println("Total Cost for 2 units: $" + eCost);
	        System.out.println(e1);

	        System.out.println();

	        // Clothing product
	        System.out.println("Clothing Details:");
	        Clothing c1 = new Clothing("T-Shirt", 25.0, "Medium");
	        c1.displayInfo();
	        double cCost = c1.calculateTotalCost(3);
	        System.out.println("Total Cost for 3 units: $" + cCost);
	        System.out.println(c1);
	    }
	}



