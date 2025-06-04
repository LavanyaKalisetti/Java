package com.nt.pgms;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicate(String s) {
        StringBuilder result = new StringBuilder();
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        String result = removeDuplicate(inputString);
        System.out.println("String after removing duplicates: " + result);
    }
}
