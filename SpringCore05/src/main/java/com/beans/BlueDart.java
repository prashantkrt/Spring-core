package com.beans;

public class BlueDart implements CourierService {
	
	static {
		System.out.println("BlueDart class is loaded");
	}

	public BlueDart() {
		System.out.println("BlueDart object is created");
	}

	@Override
	public boolean courierService(double amount) {
		System.out.println("Courier deliered through BlueDart and amont paid is " + amount);
		return true;
	}

}
