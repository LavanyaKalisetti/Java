package com.nt.Project;

public class CustomerTester {
		public static void main(String[] args) {
			
			Customer cust=new Customer();
			CardType card=new CardType();
			cust.setCustomerName("John Doe");
			cust.setMonthlySpending(7000);
	
			
			card.setCardName("Silver");
			cust.displayDetails();
			System.out.println(card.getCardName());

		}
	}
	


