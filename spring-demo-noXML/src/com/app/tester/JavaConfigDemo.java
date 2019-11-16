package com.app.tester;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.springdemo.Coach;

public class JavaConfigDemo {

	public static void main(String[] args) {
		// Read spring config file
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(com.app.config.SportConfig.class)){
			
			// Get the bean from spring container
			Coach theCoach = ctx.getBean("tennisCoach", Coach.class);
			
			// call a method on the bean
			System.out.println(theCoach.getDailyWorkout());
			
			// daily fortune
			System.out.println(theCoach.getDailyFortune());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}