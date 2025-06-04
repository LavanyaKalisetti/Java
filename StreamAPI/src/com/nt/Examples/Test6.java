/*
Question.2)
Write the java program for printing all integer elements from an integer array.
But only one time printed if duplicates are available in the array means duplicate 
not allowed for printing purpose. write the logic in stream api method only.
input : int []a={2,3,4,8,7,6,8,4,6,2};
output: 2 3 4 7 6 8
 */

package com.nt.Examples;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 8, 7, 6, 8, 4, 6, 2};

        Arrays.stream(a).distinct().forEach(n -> System.out.print(n + " "));
    }
}

