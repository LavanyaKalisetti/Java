package com.nt.functinalProgramming;

import java.util.Scanner;
import java.util.UUID;
import java.util.function.Supplier;

public class UniqueIDGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine().trim();

        Supplier<String> uniqueIdSupplier = () -> {
            String namePart = firstName.substring(0, 1).toUpperCase() + lastName.toLowerCase();
            String randomPart = UUID.randomUUID().toString().substring(0, 6);
            return namePart + "_" + randomPart;
        };

        String uniqueID = uniqueIdSupplier.get();
        System.out.println("Generated Unique ID: " + uniqueID);
    }
}
