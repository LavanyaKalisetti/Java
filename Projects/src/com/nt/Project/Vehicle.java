package com.nt.Project;

// Base Class
class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails(String vehicleType) {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Derived Class Car
class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails(String vehicleType) {
        super.displayDetails(vehicleType);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Derived Class Bike
class Bike extends Vehicle {
    String type;

    Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    @Override
    void displayDetails(String vehicleType) {
        super.displayDetails(vehicleType);
        System.out.println("Bike Type: " + type);
    }
}

