package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// Load Spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the result
		
		System.out.println("\nPointing to the same object: "+ result);
		
		
		System.out.println("\nMemory location for TheCoach: "+ theCoach);
		
		System.out.println("\nMemory location for TheCoach: "+ alphaCoach +"\n");
		
		
		//close context
		context.close();


		 

		
	}

}
