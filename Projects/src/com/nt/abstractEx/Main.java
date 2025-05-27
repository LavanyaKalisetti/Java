package com.nt.abstractEx;

public class Main {
	public static void main(String[] args) {
        OrderedCake cake1 = new OrderedCake();
        cake1.showCake();

        OrderedCake cake2 = new OrderedCake("Square", "Chocolate", 2);
        cake2.showCake();

        OrderedCake cake3 = new OrderedCake("Heart", "Strawberry", 3, "Happy Birth Day");
        cake3.showCake();
    }
}


