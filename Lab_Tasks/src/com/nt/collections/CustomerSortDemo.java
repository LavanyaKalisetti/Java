/*
Write a Program to perform sorting operation on Customer class using 
ArrayList by implementing Comparator interface 

Create a BLC class Customer
Instance variables:
customerNumber-private-Integer
customerName-private-String
customerBill-private-Double

Create a parameterized constructor to initialize the instance variable of Customer class.

Implement Comparator interface to write the logic to sort the Customer class based on the following 
a) Based on customer number
b) Based on customer name
c) Based on customer bill
Create an ELC class which contains main method, create ArrayList object to hold Customer data as well as sort the Customer data object based on the above criteria
 */
package com.nt.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer {
    private Integer customerNumber;
    private String customerName;
    private Double customerBill;

    public Customer(Integer customerNumber, String customerName, Double customerBill) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerBill = customerBill;
    }
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getCustomerBill() {
        return customerBill;
    }
    @Override
    public String toString() {
        return "CustomerNumber: " + customerNumber + ", Name: " + customerName + ", Bill: " + customerBill;
    }
}
class SortByCustomerNumber implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getCustomerNumber().compareTo(c2.getCustomerNumber());
    }
}
class SortByCustomerName implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getCustomerName().compareToIgnoreCase(c2.getCustomerName());
    }
}
class SortByCustomerBill implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getCustomerBill().compareTo(c2.getCustomerBill());
    }
}
public class CustomerSortDemo {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(105, "Ravi", 4500.50));
        customerList.add(new Customer(102, "Anjali", 9800.00));
        customerList.add(new Customer(101, "Bhanu", 6500.75));
        customerList.add(new Customer(104, "Deepak", 3200.00));
        customerList.add(new Customer(103, "Charan", 7500.25));

        System.out.println("Original List:\n");
        for (Customer c : customerList) {
            System.out.println(c);
        }

        Collections.sort(customerList, new SortByCustomerNumber());
        System.out.println("\nSorted by Customer Number:\n");
        for (Customer c : customerList) {
            System.out.println(c);
        }

        Collections.sort(customerList, new SortByCustomerName());
        System.out.println("\nSorted by Customer Name:\n");
        for (Customer c : customerList) {
            System.out.println(c);
        }

        Collections.sort(customerList, new SortByCustomerBill());
        System.out.println("\nSorted by Customer Bill:\n");
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }
}
