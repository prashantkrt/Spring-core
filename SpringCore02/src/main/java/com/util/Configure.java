package com.util;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

	public Configure() {
		System.out.println("Configure object is created");
	}

	@Bean
	public void generateAlgo() {
		Password password = new Password("RSA");
		System.out.println(password);
	}

}
