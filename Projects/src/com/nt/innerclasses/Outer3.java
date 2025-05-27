/*
  4)Anonymous Inner Class:
    Used when you want to provide the implementation of an interface or abstract class on the fly.
 */
package com.nt.innerclasses;

interface Greeting {
    void sayHello();
}

public class Outer3 {
    public static void main(String[] args) {
        // Anonymous inner class
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous inner class!");
            }
        };

        g.sayHello();
    }
}

