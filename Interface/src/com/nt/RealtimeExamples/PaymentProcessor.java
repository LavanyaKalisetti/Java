package com.nt.RealtimeExamples;

  class CreditCardPayment implements Payment{
	  
	  public void pay(double amount) {
		  System.out.println("paid $"+ amount +" "+ "Using credit card.");
	  }
  }
  
class PayPalPayment implements Payment{
	  
	  public void pay(double amount) {
		  System.out.println("paid $"+ amount +" "+ "Using PayPal.");
	  }
  }

class UpiPayment implements Payment{
	  
	  public void pay(double amount) {
		  System.out.println("paid $"+ amount +" "+ "Using UPI.");
	  }
}

public class PaymentProcessor {
	public void processPayment(Payment payment,double amount) {
		payment.pay(amount);
	}

public static void main(String []args) {
	PaymentProcessor processor=new PaymentProcessor();
	
	processor.processPayment(new CreditCardPayment(), 1500);
    processor.processPayment(new PayPalPayment(), 500);
    processor.processPayment(new UpiPayment(), 300);
}

	
}
