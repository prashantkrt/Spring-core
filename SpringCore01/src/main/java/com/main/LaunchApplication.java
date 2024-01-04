package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Amazon;

public class LaunchApplication {

	public static void main(String[] args) {

		// activating the sping container
		
		/*
		 * Spring container 1. application context 2. BeanFactory
		 * 
		 */

		// activating sprinf ioc container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * spring container has to take care of dependency and object creation part
		 */

		/*
		 * -> Storing all the beans to context
		 * -> we are communicatiing to spring framework through xml configuration file
		 * 
		 * -> creating dependent and target class object both
		 * BlueDart class is loaded 
		 * BlueDart object is created
		 * FirstFlight class is loaded 
		 * FirstFlight class object is created 
		 * FedEx class is loaded 
		 * FedEx class object is created
		 * Amazon class is loaded 
		 * Amazon object is created
		 * 
		 */
		
		// Asking spring to inject the dependecy objects to target class 		
//		Amazon amz = context.getBean("amazon",Amazon.class);
//		Amazon amz = (Amazon) context.getBean("amazon");
		Amazon amz =context.getBean(Amazon.class);
		boolean status = amz.initiateDelivery(9400.00);
		if(status)
		{
			System.out.println("order delivered");
		}
		else {
			System.out.println("Failed to deliver");
		}
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
