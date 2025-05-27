package com.nt.Collections;

import java.util.ArrayList;

class Ex {
    int x, y;

    public Ex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ex(" + x + ", " + y + ")";
    }
}

public class Test02_ArrayList {
    public static void main(String[] args) {

        // 1. Creating collection object
        ArrayList<Object> al = new ArrayList<>();

        // 2. Finding size and printing ArrayList elements
        System.out.println("Initial size: " + al.size());
        System.out.println(al);
        System.out.println();

        // 3. Adding objects to ArrayList
        al.add("a");
        al.add("b");
        al.add(5);
        al.add(6.7);
        al.add('a');
        al.add(true);
        al.add(null);
        al.add("a");
        al.add(null);
        al.add(5);

        System.out.println("ArrayList after adding elements: " + al);
        System.out.println("Size after adding elements: " + al.size());
        System.out.println();

        al.add(6.7);
        al.add(new Ex(5, 6)); // Using the Ex class

        System.out.println("ArrayList after adding more elements: " + al);
        System.out.println("Size after adding more elements: " + al.size());
        System.out.println();

        // 4. Retrieving objects randomly
        System.out.println("First element: " + al.get(0));
        System.out.println("Fifth element: " + al.get(4));
        System.out.println("Sixth element: " + al.get(5));
        System.out.println("Eleventh element: " + al.get(10));
        System.out.println();

        // 5. Retrieving objects sequentially
        System.out.print("Elements in ArrayList: ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        // 6. Searching for objects in the collection
        System.out.println("Contains 'a': " + al.contains("a"));
        System.out.println("Contains 6.7: " + al.contains(6.7));
        System.out.println("Contains 'A': " + al.contains("A"));
        System.out.println("Contains null: " + al.contains(null));
    }
}
