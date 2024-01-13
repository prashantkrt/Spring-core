package com.beans;

public class Alpha {

	private Beta beta;	
	

	public Alpha(Beta beta) {
		super();
		this.beta = beta;
	}

	public void setBeta(Beta beta) {
		this.beta = beta;
		System.out.println("Setting Beta in Alpha");
	}

	public Alpha() {
		System.out.println("Alpha bean created!!!");
	}

}
