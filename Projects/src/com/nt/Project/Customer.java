package com.nt.Project;

public class Customer {
	
	private String customerName;
	private double monthlySpending;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getMonthlySpending() {
		return monthlySpending;
	}
	public void setMonthlySpending(double monthlySpending) {
		this.monthlySpending = monthlySpending;
	}
	public void displayDetails() {
		System.out.println("Display the Customer Name:"+customerName);
		System.out.println("Display the Customer's monthly spending:"+monthlySpending);
	}
	
}

//cardtype class

	class CardType{
	private String cardName;
	
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	
	public  CardType getCardTypes(Customer customer) {
		
		//CardType ct=new CardType();
		if(customer.getMonthlySpending()<1000){
		setCardName("silver");		
		}
		else if(customer.getMonthlySpending()<1000 && customer.getMonthlySpending()>=50000) {
			setCardName("Gold");
		}
		else if(customer.getMonthlySpending()>=50000) {
			setCardName("Platinum");
		}
		return this;
		
		
	}
	@Override
	public String toString() {
		return "CardType [cardName="+cardName+"]";
	
	}
	
}
	
	
	
	
	
	
	
	
	
	