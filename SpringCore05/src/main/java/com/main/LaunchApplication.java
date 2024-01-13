package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Amazon;

public class LaunchApplication {
	public static void main(String[] args) {

		// eager loading
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Amazon amazon = context.getBean(Amazon.class);
		amazon.initiateDelivery(9876.0);

		((ClassPathXmlApplicationContext) context).close();

	}
}
