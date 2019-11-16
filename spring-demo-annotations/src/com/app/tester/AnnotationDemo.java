package com.app.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.springdemo.Coach;

public class AnnotationDemo {

	public static void main(String[] args) {
		// Read spring config file
		try(ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
			
			// Get the bean from spring container
			Coach theCoach = ctx.getBean("tennisCoach", Coach.class);
			
			// call a method on the bean
			System.out.println(theCoach.getDailyWorkout());
		}
	}

}
