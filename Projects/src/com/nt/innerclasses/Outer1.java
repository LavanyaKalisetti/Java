/*
  2)Static Nested Class:-
   A static nested class can only access static members of the outer class directly. 
   It does not need an instance of the outer class to be created.
 */
package com.nt.innerclasses;

public class Outer1 {
    private static String message = "Hey! Whatsapp";

    static class Nested {
        void show() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Outer1.Nested nested = new Outer1.Nested(); 
        nested.show();
    }
}

