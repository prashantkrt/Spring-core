package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.beans.Employee;


public class LaunchLazyLoad {

	public static void main(String[] args) {
	
		//BeanFactory factory = new DefaultListableBeanFactory();
		//older approach
		//lazy loading
		
		/*
		 * Depricated
		 * 
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		 * BeanFactory factory = new XmlBeanFactory(resource);
		 */
		
		// lazy loading
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(factory);		
		
		//loading the container
		read.loadBeanDefinitions("applicationContext.xml");
		// using this we can load multiple configuration files 
		
		
		Employee emp1 = factory.getBean("employee1",Employee.class);
		System.out.println(emp1);
		Employee emp2 = factory.getBean("employee2",Employee.class);
		System.out.println(emp2);
		Employee emp3 = factory.getBean("employee3",Employee.class);
		System.out.println(emp3);
	}

}
