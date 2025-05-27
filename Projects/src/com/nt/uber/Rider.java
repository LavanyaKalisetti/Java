package com.nt.uber;

public class Rider extends User {
    private String paymentMethod;
    private String rideType;

    public Rider() {
        this("Unknown", "Unknown", "Unknown", "Unknown", "Unknown");
    }

    public Rider(String name, String phone, String email, String payment, String rideType) {
        super(name, phone, email);
        this.paymentMethod = payment;
        this.rideType = rideType;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public void displayRiderInfo() {
        displayUserInfo();
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Ride Type: " + rideType);
    }
}

