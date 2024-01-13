package com.config;

import org.joda.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//target class
@Configuration
@ComponentScan(basePackages = "com") // this bean is first created becuase of @componentScan
public class JavaConfiguration {

	public JavaConfiguration() {
		System.out.println("JavaConfiguration instantiated by spring");
	}

	@Bean // for managing by Spring
	public LocalDateTime createBean() {
		System.out.println("LocalDateTime object bt developer");
		return LocalDateTime.now();//static method directly called by class name
	}
}
