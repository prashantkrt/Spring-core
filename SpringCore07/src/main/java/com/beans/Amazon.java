package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//target class
public class Amazon {

//	@Autowired // automatically link two objects 
//	@Qualifier("ff") // methods , fields and variables only not constructors
	private DeliveryService service;

	static {
		System.out.println("Amazon class is loaded");
	}

	public Amazon() {
		System.out.println("Amazon object is created");
	}

	@Autowired
	//@Qualifier("fd") // disallowed 
	public Amazon(@Qualifier("fd") DeliveryService service) {
		this.service = service;
		System.out.println("Amazon object is created using parameterized constructor");
	}

//	@Autowired
//	@Qualifier("fd")
	public void setService(DeliveryService service) {
		this.service = service;
	}

	public boolean initiateDelivery(double amount) {
		return service.courierService(amount);
	}

	@Override
	public String toString() {
		return "Amazon [service=" + service + "]";
	}

}
