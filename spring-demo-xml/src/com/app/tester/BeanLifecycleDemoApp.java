package com.app.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.coaches.Coach;

public class BeanLifecycleDemoApp {
	public static void main(String[] args) {
		
		// Load the spring config file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// Retrieve bean from the spring container
		Coach theCoach = ctx.getBean("myCoach", Coach.class);
		Coach alphaCoach = ctx.getBean("myCoach", Coach.class);
		
		System.out.println("\n" + theCoach + "\n" + alphaCoach + "\n");
		
		/*
		 * 	Change scope to "prototype" and see what happens
		 * */
		
		// Close Context
		ctx.close();
	}

}
