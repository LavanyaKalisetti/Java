package com.nt.uber;

public class Driver extends User {
    private String vehicleNumber;
    private double rating;

    public Driver() {
        this("Unknown", "Unknown", "Unknown", "Unknown", 0.0);
    }

    public Driver(String name, String phone, String email, String vehicle, double rating) {
        super(name, phone, email);
        this.vehicleNumber = vehicle;
        setRating(rating);
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setRating(double rating) {
        if (rating < 0.0 || rating > 5.0) {
            System.out.println("Invalid rating. Must be between 0.0 and 5.0");
            this.rating = 0.0;
        } else {
            this.rating = rating;
        }
    }

    public void displayDriverInfo() {
        displayUserInfo();
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Rating: " + rating);
    }
}

