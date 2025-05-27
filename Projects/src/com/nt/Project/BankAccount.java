
package com.nt.Project;


class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankAccount {

    private long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        double Balance = getBalance() + amt;
        setBalance(Balance);
    }

    public void withdraw(double amt) throws InsufficientFundsException {
        if (getBalance() >= amt) {
            double Balance = getBalance() - amt;
            setBalance(Balance);
        } else {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + getBalance());
    }

    public static void transfer(BankAccount sourceAccount, BankAccount destinationAccount, double amount)
            throws InsufficientFundsException {
        if (sourceAccount.getBalance() >= amount) {
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transfer successful.");
        } else {
            throw new InsufficientFundsException("Transfer failed: Insufficient funds.");
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.setAccountNumber(12345676);
        a1.setBalance(10000);

        BankAccount a2 = new BankAccount();
        a2.setAccountNumber(98765456);
        a2.setBalance(20000);

        a1.checkBalance();
        a2.checkBalance();

        a1.deposit(2000);
        System.out.println("\nAfter depositing 2000 into a1:");
        a1.checkBalance();

        try {
            a2.withdraw(3000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nAfter withdrawing 3000 from a2:");
        a2.checkBalance();

        try {
            BankAccount.transfer(a1, a2, 5000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAfter Transferring 5000 from a1 to a2:");
        a1.checkBalance();
        a2.checkBalance();
    }
}
