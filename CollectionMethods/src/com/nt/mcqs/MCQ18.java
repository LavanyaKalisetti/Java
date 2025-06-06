//What is the output of the following code :
package com.nt.mcqs;

import java.util.ArrayList;
import java.util.Vector;

class P{
    String name;
    int age;

    P(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

 }

public class MCQ18{
    public static void main(String[] args) 
    {
        Vector<P> v1 = new Vector<>();
        ArrayList<P> a1 = new ArrayList<>();

        v1.add(new P("Alice", 30));
        a1.add(new P("Alice", 30));

        System.out.println(v1.equals(a1));
        System.out.println(v1.hashCode());
        System.out.println(a1.hashCode());
    }
}
//Output:false
//       664740678
//       804564207


