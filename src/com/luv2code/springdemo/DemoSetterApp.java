package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSetterApp {

	public static void main(String[] args) {
		
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from Spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		//Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//Call our new literal values
		System.out.println(theCoach.getEmailAdresse());
		
		
		System.out.println(theCoach.getTeam());


		
		//Close the Context
		context.close();
	}

}
