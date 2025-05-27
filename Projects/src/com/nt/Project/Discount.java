
package com.nt.Project;

public class Discount {
    private double discountPercentage;

    public Discount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    
    public static Discount getDiscount(User user) {
        double amount = user.getPurchaseAmount();
        String status = user.getMembershipStatus();
        double percentage = 0.0;

        switch (status) {
            case "Regular":
                if (amount < 100) percentage = 5.0;
                else if (amount <= 500) percentage = 10.0;
                else percentage = 15.0;
                break;

            case "Silver":
                if (amount < 100) percentage = 10.0;
                else if (amount <= 500) percentage = 15.0;
                else percentage = 20.0;
                break;

            case "Gold":
                if (amount < 100) percentage = 15.0;
                else if (amount <= 500) percentage = 20.0;
                else percentage = 25.0;
                break;

            default:
                System.out.println("Invalid membership status: " + status);
        }

        return new Discount(percentage);
    }
}

