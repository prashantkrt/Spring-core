package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Voter;

public class LaunchApplication {
	public static void main(String[] args) {

		System.out.println("Container Started !!!");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Voter voter = (Voter) context.getBean("voter");
//		Voter voter = context.getBean(Voter.class);

		System.out.println(voter.checkEligibility());
		context.close();
		System.out.println("container is stopped !!!");
	}
}
