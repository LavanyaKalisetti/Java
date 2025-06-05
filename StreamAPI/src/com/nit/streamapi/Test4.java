/*
Question.4)
Write the java program to sort the integer Array in descending order where repeated
elements should be print in only one time.
Note:You have to use only Stream api functionality.
input: int[]a={2,3,4,5,8,6,5,7,8,1}
output: 8 7 6 5 4 3 2 1
 */
package com.nit.streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 8, 6, 5, 7, 8, 1};

        Arrays.stream(a)
              .distinct() 
              .boxed()   
              .sorted(Comparator.reverseOrder())
              .forEach(n -> System.out.print(n + " "));
    }
}

