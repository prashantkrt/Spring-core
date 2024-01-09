package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class LaunchApplication {
	
	public static void main(String[] args) {

		
		//eager loading
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp1 = context.getBean("employee1",Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.empActivity());
		
		
		Employee emp2 = context.getBean("employee2",Employee.class);
		System.out.println(emp2);
		
		
		Employee emp3 = (Employee) context.getBean("employee3");
		System.out.println(emp3);
		
		Employee emp4 = (Employee) context.getBean("employee4");
		System.out.println(emp4);
		((ClassPathXmlApplicationContext)context).close();
	}
}
