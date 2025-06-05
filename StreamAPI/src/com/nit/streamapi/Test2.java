/*
Question.2)
Write the java program by using stream api method you have to calculate
all digits sum in the given integer.
input : int x=123456;
output : sum=21;
 */
package com.nit.streamapi;

public class Test2 {
    public static void main(String[] args) {
        int x = 123456;

        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();                        
        System.out.println("sum = " + sum);
    }
}

