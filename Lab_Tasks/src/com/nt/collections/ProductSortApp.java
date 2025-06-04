/*
Create a class called Product which is accepting three components pid and pname and prices.
Write one parametrized constructor to throw IllegalArgumentException if pid is zero or Negative.

Create one TreeSet class which will hold the Custom product object.

With the help of TreeSet constructor using Comparator interface, write the logic to sort the Product data on the following basis
 
1) Sort based on the pid in ascending order.
2) Sort based on the pid in descending order.
3) Sort based on the name in Alphabetical order.
4) Sort based on the name in Reverse order.

 */
package com.nt.collections;

import java.util.Comparator;
import java.util.TreeSet;

class ProductInfo {
    private int pid;
    private String pname;
    private double price;

    public ProductInfo(int pid, String pname, double price) {
        if (pid <= 0) {
            throw new IllegalArgumentException("Product ID must be positive and non-zero");
        }
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductInfo{pid=" + pid + ", pname='" + pname + "', price=" + price + '}';
    }
}

public class ProductSortApp {
    public static void main(String[] args) {

        // Sample products
        ProductInfo p1 = new ProductInfo(3, "Mouse", 800.00);
        ProductInfo p2 = new ProductInfo(1, "Laptop", 55000.00);
        ProductInfo p3 = new ProductInfo(2, "Keyboard", 1500.00);
        ProductInfo p4 = new ProductInfo(5, "Charger", 1200.00);
        ProductInfo p5 = new ProductInfo(4, "Adapter", 1000.00);

        // 1. Sort by pid ascending
        TreeSet<ProductInfo> sortByPidAsc = new TreeSet<>(Comparator.comparingInt(ProductInfo::getPid));
        sortByPidAsc.add(p1);
        sortByPidAsc.add(p2);
        sortByPidAsc.add(p3);
        sortByPidAsc.add(p4);
        sortByPidAsc.add(p5);

        System.out.println("Sorted by PID Ascending:");
        sortByPidAsc.forEach(System.out::println);

        // 2. Sort by pid descending
        TreeSet<ProductInfo> sortByPidDesc = new TreeSet<>((a, b) -> Integer.compare(b.getPid(), a.getPid()));
        sortByPidDesc.add(p1);
        sortByPidDesc.add(p2);
        sortByPidDesc.add(p3);
        sortByPidDesc.add(p4);
        sortByPidDesc.add(p5);

        System.out.println("\nSorted by PID Descending:");
        sortByPidDesc.forEach(System.out::println);

        // 3. Sort by name alphabetical
        TreeSet<ProductInfo> sortByNameAlpha = new TreeSet<>(Comparator.comparing(ProductInfo::getPname, String.CASE_INSENSITIVE_ORDER));
        sortByNameAlpha.add(p1);
        sortByNameAlpha.add(p2);
        sortByNameAlpha.add(p3);
        sortByNameAlpha.add(p4);
        sortByNameAlpha.add(p5);

        System.out.println("\nSorted by Name Alphabetical:");
        sortByNameAlpha.forEach(System.out::println);

        // 4. Sort by name reverse alphabetical
        TreeSet<ProductInfo> sortByNameReverse = new TreeSet<>((a, b) -> b.getPname().compareToIgnoreCase(a.getPname()));
        sortByNameReverse.add(p1);
        sortByNameReverse.add(p2);
        sortByNameReverse.add(p3);
        sortByNameReverse.add(p4);
        sortByNameReverse.add(p5);

        System.out.println("\nSorted by Name Reverse Alphabetical:");
        sortByNameReverse.forEach(System.out::println);
    }
}
