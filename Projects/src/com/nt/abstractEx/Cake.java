package com.nt.abstractEx;

public abstract class Cake {
	private String shape;
	private String flavour;
	private int qty;
	private float price;
	
	protected Cake(String shape, String flavour, int qty) {
        this.shape = shape;
        this.flavour = flavour;
        this.qty = qty;
        this.price = qty * 400;
    }

	protected String getShape() {
		return shape;
	}

	protected void setShape(String shape) {
		this.shape = shape;
	}

	protected String getFlavour() {
		return flavour;
	}

	protected void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	protected int getQty() {
		return qty;
	}

	protected void setQty(int qty) {
		this.qty = qty;
	}

	protected float getPrice() {
		return price;
	}

	protected void setPrice(float price) {
		this.price = price;
	}
	 protected void showCake() {
	        System.out.println("A " + shape + " " + flavour + " Cake Of " + qty + " Kg/Kg's Ready @ Rs." + price + "/-");
    }
}


class OrderedCake extends Cake {
    private String message;
    
    public OrderedCake() {
        super("Round", "Vanilla", 1);
        setPrice(1 * 400);
        this.message = null;
    }
    
    public OrderedCake(String shape, String flavour, int qty) {
        super(shape, flavour, qty);
        setPrice(qty * 400);
        this.message = null;
    }

    public OrderedCake(String shape, String flavour, int qty, String message) {
        super(shape, flavour, qty);
        setPrice(qty * 400);
        this.message = message;
    }
    
    @Override
    public void showCake() {
        if (message != null && !message.trim().isEmpty()) {
            System.out.println("A " + getShape()  + " " + getFlavour()  + " Cake of " + getQty()  + 
                               " Kg/Kg's ready with message " + message + " @ Rs." + getPrice()  + "/-");
        } else {
            super.showCake();
        }
    }
}

     