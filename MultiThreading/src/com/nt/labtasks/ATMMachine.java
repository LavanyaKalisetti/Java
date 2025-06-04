package com.nt.labtasks;

public class ATMMachine {
    static class Account {
        private int balance = 0;

        public synchronized void withdraw(int amount) {
            while (balance < amount) {
                System.out.println("Waiting to withdraw " + amount + ", current balance: " + balance);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Updated balance: " + balance);
            notify();
        }

        public synchronized void deposit(int amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", Updated balance: " + balance);
            notify(); 
        }
    }
    static class Drawer extends Thread {
        private Account account;

        public Drawer(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            int[] withdrawals = {100, 50, 200, 300};

            for (int amount : withdrawals) {
                account.withdraw(amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class Depositor extends Thread {
        private Account account;

        public Depositor(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            int[] deposits = {200, 100, 300};

            for (int amount : deposits) {
                account.deposit(amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        Account acc = new Account();

        Depositor depositor = new Depositor(acc);
        Drawer drawer = new Drawer(acc);

        depositor.start();
        drawer.start();
    } 
}
