package com.nt.pgms;

class PetrolPump {
 public synchronized void refillCar(String carName) {
     System.out.println(carName + " started refilling...");
     try {
         Thread.sleep(3000);
     } catch (InterruptedException e) {
         System.out.println(carName + " was interrupted during refilling.");
     }
     System.out.println(carName + " completed refilling!");
 }
}
class Car implements Runnable {
 private String name;
 private PetrolPump petrolPump;

 public Car(String name, PetrolPump petrolPump) {
     this.name = name;
     this.petrolPump = petrolPump;
 }
 public void run() {
     petrolPump.refillCar(name);
  }
}
public class PetrolPumpSimulation {
 public static void main(String[] args) {
     PetrolPump petrolPump = new PetrolPump(); 
     String[] carNames = { "Car-A", "Car-B", "Car-C", "Car-D" };
     Thread[] carThreads = new Thread[carNames.length];

     for (int i = 0; i < carNames.length; i++) {
         Car car = new Car(carNames[i], petrolPump);
         carThreads[i] = new Thread(car);
     }
     for (Thread t : carThreads) {
         t.start();
     }
     for (Thread t : carThreads) {
         try {
             t.join();
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted while waiting for car threads.");
         }
     }
     System.out.println("All cars have completed refueling.");
  }
}

