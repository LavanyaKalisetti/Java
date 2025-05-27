package com.nt.QueueExamples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	    public static void main(String[] args) {
	    	
	    	//Creating LinkedList
	        Queue<String> tasks = new LinkedList<>();

	        tasks.add("Task 1");
	        tasks.add("Task 2");
	        tasks.add("Task 3");

	        System.out.println("All tasks: " + tasks);

	        System.out.println("Processing: " + tasks.poll());  // Removes head
	        System.out.println("Next: " + tasks.peek());        // Peeks head

	        System.out.println("Remaining: " + tasks);
	    }
	}


