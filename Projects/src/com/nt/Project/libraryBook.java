package com.nt.Project;

public class libraryBook {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	private double discountPercentage;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double getFinalPrice() {
		double finalPrice = price-(price*discountPercentage/100);
		return discountPercentage;
		
	}
	
	public static void main(String[] args) {
		libraryBook lb=new libraryBook();
		
		lb.setAuthor("Jeff keller");
		lb.setDiscountPercentage(10);
		lb.setISBN("jhb");
		lb.setPrice(876);
		lb.setTitle("Attitued is Everything");
		
		
		System.out.println(lb.getAuthor());
		System.out.println(lb.getDiscountPercentage());
		System.out.println(lb.getFinalPrice());
		System.out.println(lb.getISBN());
		System.out.println(lb.getPrice());
		System.out.println(lb.getTitle());
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
