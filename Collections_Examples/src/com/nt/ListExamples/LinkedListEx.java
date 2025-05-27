package com.nt.ListExamples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	    public static void main(String[] args) {
	    	
	    	//Creating LinkedList
	        List<String> cities = new LinkedList<>();

	        cities.add("Delhi");
	        cities.add("Mumbai");
	        cities.add("Chennai");
	        cities.addFirst("Kolkata");  // Only available via LinkedList reference

	        System.out.println("Cities: " + cities);

	        cities.remove("Mumbai");
	        System.out.println("After removal: " + cities);

	        // Accessing elements
	        System.out.println("First city: " + cities.get(0));

	        // Iterating
	        for (String city : cities) {
	            System.out.println(city);
	        }
	    }
	}



