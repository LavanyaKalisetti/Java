/*
Create a class called Book which take two components name and author.

Implement this Book class with Comparable interface to sort the books based on the name using compareTo() method.

Create an ELC class BookSorted which will sort the book based on the name.

Create one TreeSet object which will hold Book as a custom object.

Insert 5 book records using custom object.

Display all the books sorted in alphabetial order.
 */
package com.nt.collections;

import java.util.*;

class Book implements Comparable<Book> {
 private String name;
 private String author;

 // Constructor
 public Book(String name, String author) {
     this.name = name;
     this.author = author;
 }

 // Getters
 public String getName() {
     return name;
 }

 public String getAuthor() {
     return author;
 }

 @Override
 public int compareTo(Book other) {
     return this.name.compareToIgnoreCase(other.name);
 }

 @Override
 public String toString() {
     return "Book{name='" + name + "', author='" + author + "'}";
 }
}

public class BookSorted {
 public static void main(String[] args) {
  
     TreeSet<Book> bookSet = new TreeSet<>();

     // Add 5 Book objects
     bookSet.add(new Book("Java Programming", "James Gosling"));
     bookSet.add(new Book("Algorithms", "Robert Sedgewick"));
     bookSet.add(new Book("Data Structures", "Mark Allen Weiss"));
     bookSet.add(new Book("Clean Code", "Robert C. Martin"));
     bookSet.add(new Book("Artificial Intelligence", "Stuart Russell"));

     // Display all books sorted by name
     System.out.println("Books sorted in alphabetical order by name:");
     for (Book b : bookSet) {
         System.out.println(b);
     }
 }
}

