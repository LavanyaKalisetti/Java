package com.nt.MapExamples;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEx {
	
	    public static void main(String[] args) {
	        // Creating a Hashtable
	        Map<Integer, String> students = new Hashtable<>();

	        // Adding key-value pairs
	        students.put(1, "Alice");
	        students.put(2, "Bob");
	        students.put(3, "Charlie");

	        // Printing the Hashtable
	        System.out.println("Student Records: " + students);

	        // Accessing a value using a key
	        System.out.println("Student with ID 2: " + students.get(2));

	        // Removing a key-value pair
	        students.remove(3);

	        System.out.println("After removing ID 3: " + students);

	        // Checking if a key exists
	        System.out.println("Contains key 1? " + students.containsKey(1));

	        // Iterating through the Hashtable
	        for (Map.Entry<Integer, String> entry : students.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	    }
	}

