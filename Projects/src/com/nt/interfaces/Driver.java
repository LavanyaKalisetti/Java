package com.nt.interfaces;

public class Driver implements IVehicle {

	@Override
	public void start() {
		System.out.println("Driver.start()::"+"Vehicle starts");
	}

	@Override
	public void stop() {
		System.out.println("Driver.stop()::"+"Vehicle stops");
	}

	public static void main(String[] args) {
		Driver d=new Driver();
		d.start();
		d.stop();
	}
}
