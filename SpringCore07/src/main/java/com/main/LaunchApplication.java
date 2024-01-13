package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Amazon;

public class LaunchApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Amazon amazon = context.getBean(Amazon.class);
		boolean status =amazon.initiateDelivery(4500.00);
		System.out.println(amazon);
		if(status)
		{
			System.out.println("Delivered successfully");
		}
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
