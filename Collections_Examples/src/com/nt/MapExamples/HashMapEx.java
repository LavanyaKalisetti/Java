package com.nt.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {


    public static void main(String[] args) {
    	
    	//Creating HashMap
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        System.out.println("All Students: " + students);

        students.remove(2);

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.println("Contains ID 3? " + students.containsKey(3));
        System.out.println("Student with ID 1: " + students.get(1));
    }
}



