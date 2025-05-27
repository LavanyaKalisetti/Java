package com.nt.Project;

public class Test {
    public static void main(String[] args) {
        Car c = new Car("Audi", "Q8", 2022, 5);
        Bike b = new Bike("Yamaha", "MT-07", 2023, "Sports");

        c.displayDetails("Car");
        System.out.println();
        b.displayDetails("Bike");
    }
}

