/*
   3)Local Inner Class (Inside a Method)
     This class is defined within a method and is only visible within that method. 
     It can access local variables that are final or effectively final.
 */
package com.nt.innerclasses;

public class Outer2 {
    void outerMethod() {
        String localVar = "Local variable";

        // Local inner class
        class LocalInner {
            void print() {
                System.out.println(localVar);
            }
        }

        LocalInner inner = new LocalInner();
        inner.print();
    }

    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.outerMethod();
    }
}
