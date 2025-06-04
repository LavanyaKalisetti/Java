package com.nt.mcq;

class TicketThread implements Runnable {
    String str;

    TicketThread(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(str + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test19 {
    public static void main(String[] args) {
        TicketThread obj1 = new TicketThread("Cut the Ticket");
        TicketThread obj2 = new TicketThread("Show the Seat");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
