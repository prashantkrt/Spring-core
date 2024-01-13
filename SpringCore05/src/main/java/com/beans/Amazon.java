package com.beans;

// Target class
public class Amazon {

	private CourierService service;

	static {
		System.out.println("Amazon class is loaded");
	}

	public Amazon() {
		System.out.println("Amazon object is created");
	}

	// through constructor
	public Amazon(CourierService service) {
		this.service = service;
		System.out.println("Amazon object is created using parameterized constructor");
	}

	// through setter
	public void setService(CourierService service) {
		this.service = service;
	}

	public boolean initiateDelivery(double amount) {
		return service.courierService(amount);
	}

}
