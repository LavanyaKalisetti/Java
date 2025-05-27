package com.nt.Project;

	public class Product {
	    protected String name;
	    protected double price;

	    public Product(String name, double price) {
	        if (price <= 0) {
	            System.out.println("Error Invalid Input");
	            //System.exit(0);
	        }
	        this.name = name;
	        this.price = price;
	    }

	    public void displayInfo() {
	        System.out.println("Product Name: " + name);
	        System.out.println("Price: $" + price);
	    }

	    public double calculateTotalCost(int quantity) {
	        if (quantity <= 0) {
	            System.out.println("Error Invalid Input");
	            //System.exit(0);
	        }
	        return price * quantity;
	    }

	    @Override
	    public String toString() {
	        return "Product [name=" + name + ", price=" + price + "]";
	    }
	}

  class Electronics extends Product {
	    private String brand;

	    public Electronics(String name, double price, String brand) {
	        super(name, price);
	        this.brand = brand;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Brand: " + brand);
	    }

	    @Override
	    public String toString() {
	        return "Electronics [name=" + name + ", price=" + price + ", brand=" + brand + "]";
	    }
	}
  class Clothing extends Product {
      private String size;

      public Clothing(String name, double price, String size) {
          super(name, price);
          this.size = size;
      }

      @Override
      public void displayInfo() {
          super.displayInfo();
          System.out.println("Size: " + size);
      }

      @Override
      public String toString() {
          return "Clothing [name=" + name + ", price=" + price + ", size=" + size + "]";
      }
  }

