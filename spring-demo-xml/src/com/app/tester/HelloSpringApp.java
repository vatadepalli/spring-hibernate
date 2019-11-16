package com.app.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.coaches.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve a bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Call the new methods available via Dependency Injection
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}