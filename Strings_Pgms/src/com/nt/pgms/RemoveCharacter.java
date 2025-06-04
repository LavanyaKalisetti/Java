package com.nt.pgms;

import java.util.Scanner;

public class RemoveCharacter {

    public static String removeAllOccurance(String s, char ch) {
        return s.replace(Character.toString(ch), "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter a character to remove: ");
        char ch = sc.next().charAt(0);
        String result = removeAllOccurance(inputString, ch);
        System.out.println("Result after removing '" + ch + "': " + result);
    }
}
