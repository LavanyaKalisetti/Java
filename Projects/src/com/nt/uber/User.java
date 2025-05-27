package com.nt.uber;

public class User {
    private String name;
    private String phoneNumber;
    private String email;

    public User() {
        this("Unknown", "Unknown", "Unknown");
    }

    public User(String name, String phoneNumber, String email) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name provided.");
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            System.out.println("Invalid phone number.");
            this.phoneNumber = "Unknown";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = email != null ? email : "Unknown";
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
