package com.nt.Project;

	public class User {

	    private String userName;
	    private double purchaseAmount;
	    private String membershipStatus;

	    
	    public String getUserName() {
	        return userName;
	    }
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	    public double getPurchaseAmount() {
	        return purchaseAmount;
	    }
	    public void setPurchaseAmount(double purchaseAmount) {
	        this.purchaseAmount = purchaseAmount;
	    }
	    public String getMembershipStatus() {
	        return membershipStatus;
	    }
	    public void setMembershipStatus(String membershipStatus) {
	        this.membershipStatus = membershipStatus;
	    }

	  
	    public void displayDiscount() {
	        System.out.println("User Name: " + userName);
	        System.out.println("Purchase Amount: $" + purchaseAmount);
	        System.out.println("Membership Status: " + membershipStatus);
	    }

	
	    public void applyDiscount(Discount discount) {
	        double discountPercent = discount.getDiscountPercentage();
	        double discountAmount = purchaseAmount * (discountPercent / 100);
	        double finalPrice = purchaseAmount - discountAmount;

	        System.out.println("Discount Applied: " + discountPercent + "%");
	        System.out.println("Discount Amount: $" + discountAmount);
	        System.out.println("Final Price After Discount: $" + finalPrice);
	        System.out.println("");
	    }
	}

