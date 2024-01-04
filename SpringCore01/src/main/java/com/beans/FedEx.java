package com.beans;

//dependency classs
public class FedEx implements DeliveryService {

	static {
		System.out.println("FedEx class is loaded");
	}

	public FedEx() {
		System.out.println("FedEx class object is created");
	}

	@Override
	public boolean courierService(double amount) {
		System.out.println("Courier deliered through FedEx and amont paid is " + amount);
		return true;
	}
}
