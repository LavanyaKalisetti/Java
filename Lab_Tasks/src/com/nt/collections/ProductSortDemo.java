/*
 Write a Program to perform sorting operation on Product class using ArrayList by implementing Comparable interface.

Create a BLC class Product.
Instance variables:
productNumber-private-Integer
productName-private-String
productPrice-private-Double
Create a parameterized constructor to initialize the instance variable of Product class.
Implement Comparable interface to write the logic to sort the Product class based on the Product Name.
Create an ELC class which contains main method, create ArrayList object to hold Product data as well as sort the product data object based on the product name.
 */

package com.nt.collections;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {
    private Integer productNumber;
    private String productName;
    private Double productPrice;

    public Product(Integer productNumber, String productName, Double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public Integer getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }
    @Override
    public int compareTo(Product other) {
        return this.productName.compareToIgnoreCase(other.productName);
    }
    @Override
    public String toString() {
        return "ProductNumber: " + productNumber + ", Name: " + productName + ", Price: " + productPrice;
    }
}
public class ProductSortDemo {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        
        productList.add(new Product(101, "Mobile", 15000.00));
        productList.add(new Product(102, "Laptop", 55000.00));
        productList.add(new Product(103, "Tablet", 25000.00));
        productList.add(new Product(104, "SmartWatch", 10000.00));
        productList.add(new Product(105, "Camera", 30000.00));

        System.out.println("Before Sorting:\n");
        for (Product p : productList) {
            System.out.println(p);
        }
        Collections.sort(productList);
        System.out.println("\nAfter Sorting by Product Name:\n");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}

