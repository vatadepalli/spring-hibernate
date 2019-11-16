package com.app.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.coaches.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {

		// Load spring config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		CricketCoach theCoach = ctx.getBean("myCricketCoach", CricketCoach.class);

		// Call method on the beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Call field getter Methods on the beans
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		// Close the context
		ctx.close();
	}

}
