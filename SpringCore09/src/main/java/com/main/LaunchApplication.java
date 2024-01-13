package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.GreetMe;
import com.config.JavaConfiguration;

public class LaunchApplication {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		GreetMe gm = context.getBean(GreetMe.class);
		System.out.println(gm.generateGreeting("Harsh"));

		((AnnotationConfigApplicationContext) context).close();
	}
}
