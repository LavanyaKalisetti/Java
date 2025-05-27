package com.nt.MapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
	
	    public static void main(String[] args) {
	    	
	    	//Creating LinkedHashmap
	        Map<String, Integer> scores = new LinkedHashMap<>();

	        scores.put("Math", 90);
	        scores.put("Science", 85);
	        scores.put("English", 88);

	        System.out.println("Insertion Order Map: " + scores);
	    }
	}


	
