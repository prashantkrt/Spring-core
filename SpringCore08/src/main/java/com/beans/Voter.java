package com.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "voter") // means object ref name is voter
@PropertySource(value = "com/common/application.properties")
public class Voter {

	@Value("${voter.info.name}")
	private String name;

	@Value("${voter.info.age}")
	private String age;

	static {
		// first
		System.out.println("Voter class is loaded");
	}

	{
		// second
		System.out.println("non static block is loaded for voter class");
	}

	public Voter() {
		// thrid
		System.out.println("Voter is instantiated");
	}

	// if I want post object creating method to be called
	// depricated
	@PostConstruct
	public void myInit() {
		// fourth
		System.out.println("myinit");
	}

	// business logic
	public String checkEligibility() {
		System.out.println("Method call with busniess logic");
		if (Integer.parseInt(age) >= 18)
			return name + " is eligible " + age;
		return name + " is not eligible " + age;
	}

	// if we want to run after all like GC
	@PreDestroy
	public void destroy() {
		System.out.println("Bean Destroyed");
	}
}
