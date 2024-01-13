package com.beans;

public class Beta {

	private Alpha alpha;
	

	public Beta(Alpha alpha) {
		super();
		this.alpha = alpha;
	}

	public void setAlpha(Alpha alpha) {
		this.alpha = alpha;
		System.out.println("Setting Alpha in Beta");
	}

	public Beta() {
		System.out.println("Beta bean created!!!");
	}
}
