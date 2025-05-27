package com.nt.Project;

class Animal {
    private String name;

    public Animal(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Animal Name: " + name);
    }
}

class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur);
        if (breed == null || breed.isEmpty()) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void displayDetails() {
        System.out.println("Dog Details:");
        super.displayDetails();
        System.out.println("Breed: " + breed);
    }
}
