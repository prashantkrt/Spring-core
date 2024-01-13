package com.beans;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetMe {

	@Autowired
	private LocalDateTime date;

	public GreetMe() {
		System.out.println("GreatMe bean is created");
	}

	public String generateGreeting(String name) {
		int hour = date.getHourOfDay();
		if (hour < 12)
			return "good morning !!! :) " + name;
		else if (hour < 16)
			return "good afternoon " + name;
		else if (hour < 20)
			return "good evening " + name;
		else
			return "good night " + name;
	}
}
