package com.nt.uber;

import com.nt.uber.Driver;
import com.nt.uber.Rider;

public class RideSharing {
    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        Driver d1 = new Driver("Amit", "9876543210", "amit@driver.com", "KA01AB1234", 4.5);
        d1.displayDriverInfo();

        System.out.println("\nTest Case 2:");
        Rider r1 = new Rider();
        r1.setName("Priya");
        r1.setPhoneNumber("9123456789");
        r1.setEmail("priya@rider.com");
        r1.setPaymentMethod("Credit Card");
        r1.setRideType("Luxury");
        r1.displayRiderInfo();

        System.out.println("\nTest Case 3:");
        Driver d2 = new Driver();
        d2.setName("");
        d2.setPhoneNumber(null);
        d2.setEmail("driver@test.com");
        d2.setVehicleNumber("MH12XY1234");
        d2.setRating(6.0); // Invalid
        d2.displayDriverInfo();

        System.out.println("\nTest Case 4:");
        Rider r2 = new Rider("Rohit", "9090909090", "rohit@rider.com", "UPI", "Standard");
        r2.setRideType("Premium");
        r2.displayRiderInfo();
    }
}
