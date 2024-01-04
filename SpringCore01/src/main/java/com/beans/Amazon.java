package com.beans;

//target class
public class Amazon {

	private DeliveryService service;

	static {
		System.out.println("Amazon class is loaded");
	}

	public Amazon() {
		System.out.println("Amazon object is created");
	}

	public Amazon(DeliveryService service) {
		this.service = service;
		System.out.println("Amazon object is created using parameterized constructor");
	}

	public void setService(DeliveryService service) {
		this.service = service;
	}

	public boolean initiateDelivery(double amount) {
		return service.courierService(amount);
	}

}
