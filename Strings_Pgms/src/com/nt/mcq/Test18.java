package com.nt.mcq;

class CustomThread extends Thread {
    String myName;

    CustomThread(String name) {
        myName = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(myName);
        }
    }
}

public class Test18 {
    public static void main(String args[]) {
        try {
            CustomThread ct1 = new CustomThread("ct1");
            CustomThread ct2 = new CustomThread("ct2");
            ct1.start();
            ct1.join(); // Wait for ct1 to finish before starting ct2
            ct2.start();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
