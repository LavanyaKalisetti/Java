/*
Write a java program for finding each String length from Strings Array through 
Stream api method.
input: String[]s={"SashiKant","Raone","Bhole","Tomato"};
output:
SashiKant: 9
Raone: 5
Bhole: 5
Tomato: 6
 */

package com.nt.Examples;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        String[] s = {"SashiKant", "Raone", "Bhole", "Tomato"};
        
        Arrays.stream(s).forEach(str -> System.out.println(str + ": " + str.length()));
    }
}

