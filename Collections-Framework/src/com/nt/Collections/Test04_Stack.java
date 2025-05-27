package com.nt.Collections;

import java.util.Stack;

public class Test04_Stack {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");

        System.out.println(stack); 
        // Popping elements (LIFO order)
        System.out.println(stack.pop());
        System.out.println(stack);  

        System.out.println(stack.pop());
        System.out.println(stack); 

        System.out.println(stack.pop()); 
        System.out.println(stack); 

        // Peeking the top element (does not remove it)
        System.out.println(stack.peek()); 
        System.out.println(stack);  

        System.out.println(stack.peek()); 
        System.out.println(stack);  

        // Adding an integer to a stack with Strings (not recommended)
        stack.push(5);  
        System.out.println(stack);  

        // Retrieving elements by index
        System.out.println(stack.get(0)); 
        System.out.println(stack.get(2));

        // Recommendation: Java 5 onwards, use ArrayDeque instead of Stack
    }
}

	
//Java 5v onwards it is recommended to use ArrayDeque instead of Stack for retrieving objects in LIFO order
	




