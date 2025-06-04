package com.nt.pgms;

import java.util.Scanner;

public class VowelCaseConverter {
    public static String convertVowelCases(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("AEIOU".indexOf(ch) != -1) {
                result.append(Character.toLowerCase(ch));
            } else if ("aeiou".indexOf(ch) != -1) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = convertVowelCases(input);
        System.out.println("Converted string: " + output);
    }
}
