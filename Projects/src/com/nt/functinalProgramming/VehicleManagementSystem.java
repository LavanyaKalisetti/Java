/*
   Vehicle Management System with Inner Classes,

   You are tasked with developing a Java program for managing different types of vehicles in a transportation system. 
   The program should allow users to add vehicles, perform vehicle-specific operations, 
   and manage vehicle details efficiently. 
   Your objective is to design a flexible solution using inner classes to encapsulate 
   related functionalities within the vehicle management system.

Your program should include the following components:
------------------------------------------------------

Car Class (Inner Class of Vehicle):

Attributes:
 numberOfDoors (int): The number of doors in the car.
 fuelEfficiency (double): The fuel efficiency of the car in kilometers per liter.
 
Methods:
 calculateFuelConsumption(double distance): Calculates the amount of fuel consumed by the car to travel a specified distance based on its fuel efficiency.
 getNumberOfDoors(): Retrieves the number of doors in the car.
 getFuelEfficiency(): Retrieves the fuel efficiency of the car.

Truck Class (Inner Class of Vehicle):

Attributes:
 loadCapacity (double): The maximum load capacity of the truck in tons.
 cargoType (String): The type of cargo the truck is designed to carry.
 
Methods:
 determineAvailableSpace(double currentLoad): Determines the available space for additional cargo based on the current load and maximum load capacity.
 getCargoType(): Retrieves the type of cargo the truck is designed to carry.
 getLoadCapacity(): Retrieves the maximum load capacity of the truck.

Motorcycle Class (Inner Class of Vehicle):

Attributes:
 engineCapacity (int): The engine capacity of the motorcycle in cubic centimeters (cc).
 hasSpecialFeatures (boolean): Indicates whether the motorcycle has special features or not.
 
Methods:
 checkSpecialFeatures(): Checks if the motorcycle has any special features.
 getEngineCapacity(): Retrieves the engine capacity of the motorcycle.
 hasSpecialFeatures(): Checks if the motorcycle has special features.

To test the code:

Implement the VehicleManagementSystem class with the outlined functionalities.
Create instances of different types of vehicles (car, truck, motorcycle) and add them to the system.
Call the appropriate methods to perform vehicle-specific operations, such as calculating fuel consumption, determining available space, and checking special features.
Finally, view the details of all vehicles in the system to verify the results.

Sample Output :
---------------------
Fuel consumption of the car: 6.45 liters
Available space in the truck: 5.0 tons
Checking special features of the motorcycle: true

Vehicle Details:
Car: Sedan
- Number of Doors: 4
- Fuel Efficiency: 15.5 km/l

Truck: Cargo Truck
- Load Capacity: 10.5 tons
- Cargo Type: Goods

Motorcycle: Sports Bike
- Engine Capacity: 1000 cc
- Special Features: Yes

 */

package com.nt.functinalProgramming;

public class VehicleManagementSystem {

    class Car {
        private int numberOfDoors;
        private double fuelEfficiency;
        private String model;

        public Car(String model, int numberOfDoors, double fuelEfficiency) {
            this.model = model;
            this.numberOfDoors = numberOfDoors;
            this.fuelEfficiency = fuelEfficiency;
        }

        public double calculateFuelConsumption(double distance) {
            return distance / fuelEfficiency;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        public double getFuelEfficiency() {
            return fuelEfficiency;
        }

        public String getModel() {
            return model;
        }
    }

    class Truck {
        private double loadCapacity;
        private String cargoType;
        private String model;

        public Truck(String model, double loadCapacity, String cargoType) {
            this.model = model;
            this.loadCapacity = loadCapacity;
            this.cargoType = cargoType;
        }

        public double determineAvailableSpace(double currentLoad) {
            return loadCapacity - currentLoad;
        }

        public String getCargoType() {
            return cargoType;
        }

        public double getLoadCapacity() {
            return loadCapacity;
        }

        public String getModel() {
            return model;
        }
    }

    class Motorcycle {
        private int engineCapacity;
        private boolean hasSpecialFeatures;
        private String model;

        public Motorcycle(String model, int engineCapacity, boolean hasSpecialFeatures) {
            this.model = model;
            this.engineCapacity = engineCapacity;
            this.hasSpecialFeatures = hasSpecialFeatures;
        }

        public boolean checkSpecialFeatures() {
            return hasSpecialFeatures;
        }

        public int getEngineCapacity() {
            return engineCapacity;
        }

        public boolean hasSpecialFeatures() {
            return hasSpecialFeatures;
        }

        public String getModel() {
            return model;
        }
    }

    public static void main(String[] args) {
        VehicleManagementSystem vms = new VehicleManagementSystem();

        Car car = vms.new Car("Sedan", 4, 15.5);
        double fuelConsumed = car.calculateFuelConsumption(100); // For 100 km
        System.out.printf("Fuel consumption of the car: %.2f liters\n", fuelConsumed);

        Truck truck = vms.new Truck("Cargo Truck", 10.5, "Goods");
        double availableSpace = truck.determineAvailableSpace(5.5); // Current load
        System.out.printf("Available space in the truck: %.1f tons\n", availableSpace);

        Motorcycle motorcycle = vms.new Motorcycle("Sports Bike", 1000, true);
        boolean specialFeatures = motorcycle.checkSpecialFeatures();
        System.out.println("Checking special features of the motorcycle: " + specialFeatures);

        System.out.println("\nVehicle Details:");

        System.out.println("Car: " + car.getModel());
        System.out.println("- Number of Doors: " + car.getNumberOfDoors());
        System.out.println("- Fuel Efficiency: " + car.getFuelEfficiency() + " km/l");

        System.out.println("\nTruck: " + truck.getModel());
        System.out.println("- Load Capacity: " + truck.getLoadCapacity() + " tons");
        System.out.println("- Cargo Type: " + truck.getCargoType());

        System.out.println("\nMotorcycle: " + motorcycle.getModel());
        System.out.println("- Engine Capacity: " + motorcycle.getEngineCapacity() + " cc");
        System.out.println("- Special Features: " + (motorcycle.hasSpecialFeatures() ? "Yes" : "No"));
    }
}

