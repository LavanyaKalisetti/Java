package com.nt.Project;

class Ticket {
    private String eventName;
    private int seatNumber;
    private double price;

    public Ticket(String eventName, int seatNumber, double price) {
        if (seatNumber <= 0 || price <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.eventName = eventName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

class VIPTicket extends Ticket {
    private String specialAccess;

    public VIPTicket(String eventName, int seatNumber, double price, String specialAccess) {
        super(eventName, seatNumber, price);
        this.specialAccess = specialAccess;
    }

    @Override
    public void displayDetails() {
        System.out.println("VIP Ticket:");
        super.displayDetails();
        System.out.println("Special Access: " + specialAccess);
        System.out.println();
    }
}

class StudentTicket extends Ticket {
    private boolean studentDiscount;

    public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
        super(eventName, seatNumber, price);
        this.studentDiscount = studentDiscount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Ticket:");
        super.displayDetails();
        System.out.println("Student Discount: " + studentDiscount);
    }
}
public class MainTicket {
    public static void main(String[] args) {

        // Test Case 1: Invalid input
//        int invalidSeat = 0;
//        double invalidPrice = -10;
//        if (invalidSeat <= 0 || invalidPrice <= 0) {
//            System.out.println("Error Invalid Input");
//            return;
//        }

        // Test Case 2: Valid input
        Ticket t = new Ticket("Concert", 101, 50.0);
        VIPTicket vt = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
        StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);

        System.out.println("Regular Ticket:");
        t.displayDetails();
        System.out.println();

        vt.displayDetails();
        studentTicket.displayDetails();
    }
}


