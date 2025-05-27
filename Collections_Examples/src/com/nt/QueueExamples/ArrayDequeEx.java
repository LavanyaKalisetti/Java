package com.nt.QueueExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
	    public static void main(String[] args) {
	    	
	    	//Creating ArrayDeque
	        Deque<String> deque = new ArrayDeque<>();

	        deque.addFirst("Front");
	        deque.addLast("Back");

	        System.out.println("Deque: " + deque);

	        System.out.println("Removed Front: " + deque.removeFirst());
	        System.out.println("Removed Back: " + deque.removeLast());
	        
	        System.out.println("Deque: " + deque);
	    }
	}

