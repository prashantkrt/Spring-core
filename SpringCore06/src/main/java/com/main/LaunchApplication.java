package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;



public class LaunchApplication {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
		((ClassPathXmlApplicationContext)context).close();
	}

}
