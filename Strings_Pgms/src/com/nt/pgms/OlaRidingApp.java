package com.nt.pgms;

class RideRequest extends Thread {
    public void run() {
        try {
            System.out.println("User requested a ride...");
            Thread.sleep(2000);
            System.out.println("Searching for nearby drivers...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DriverAssignment extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Driver found and assigned!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class FareCalculation extends Thread {
    public void run() {
        try {
            System.out.println("Calculating estimated fare...");
            Thread.sleep(1500); // wait 1.5 seconds
            System.out.println("Estimated fare: 135.75 RS.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LiveTracking extends Thread {
    public void run() {
        try {
            for (int i = 20; i <= 100; i += 20) {
                System.out.println("Updating ride location... " + i + "% completed");
                Thread.sleep(500);
            }
            System.out.println("Ride completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PaymentProcessing extends Thread {
    public void run() {
        try {
            System.out.println("Processing payment...");
            Thread.sleep(2000); 
            System.out.println("Payment successful!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class RatingSystem extends Thread {
    public void run() {
        try {
            System.out.println("Requesting user rating...");
            Thread.sleep(1000);
            System.out.println("User rated the ride: 5 star");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class OlaRidingApp {
    public static void main(String[] args) {
        try {
            RideRequest rideRequest = new RideRequest();
            FareCalculation fareCalculation = new FareCalculation();

            rideRequest.start();
            fareCalculation.start();

            rideRequest.join();

            DriverAssignment driverAssignment = new DriverAssignment();
            driverAssignment.start();
            driverAssignment.join();

            LiveTracking liveTracking = new LiveTracking();
            liveTracking.start();
            liveTracking.join();

            PaymentProcessing paymentProcessing = new PaymentProcessing();
            paymentProcessing.start();
            paymentProcessing.join();

            RatingSystem ratingSystem = new RatingSystem();
            ratingSystem.start();
            ratingSystem.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

