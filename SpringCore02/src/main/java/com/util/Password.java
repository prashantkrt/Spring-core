package com.util;

public class Password {
	public Password(String algo) {
		System.out.println("Password object is created using algo "+algo);
	}

	@Override
	public String toString() {
		return "Password object";
	}
	
	public void display()
	{
		System.out.println("Password object cretaed by us but still it's a bean ");
	}

}
