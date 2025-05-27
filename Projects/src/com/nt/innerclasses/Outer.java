/*
 1)Non-static Inner Class:
   This class is associated with an instance of its enclosing class. 
   It cannot define any static members.
 */

package com.nt.innerclasses;

public class Outer {
    private String message = "Hello! Lavanya.";

    class Inner {
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); 
        inner.display();
    }
}
