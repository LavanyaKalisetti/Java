package com.nt.MapExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
	
	    public static void main(String[] args) {
	    	
	    	//Creating TreeMap
	        Map<Integer, String> map = new TreeMap<>();

	        map.put(3, "C");
	        map.put(1, "A");
	        map.put(2, "B");

	        System.out.println("Sorted Map by Keys: " + map);
	    }
	}



