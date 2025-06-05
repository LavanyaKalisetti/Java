/*
Question.3)
By using Stream api method you have to find maximum value from an integer Array.
Hera you can use max method of Stream Class.
input: int []a={2,3,4,5,6,7,8,1};
output: Max=8.
 */
package com.nit.streamapi;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 1};

        int max = Arrays.stream(a).max().orElseThrow(); 
        System.out.println("Max = " + max);
    }
}
