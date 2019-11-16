package com.app.tester;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.springdemo.Coach;

public class JavaConfigDemo {

	public static void main(String[] args) {
		// Read spring config file
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(com.app.config.SportConfig.class)){
			
			// Get the bean from spring container
			Coach theCoach = ctx.getBean("swimCoach", Coach.class);
			
			// call a method on the bean
			System.out.println(theCoach.getDailyWorkout());
			
			// daily fortune
			System.out.println(theCoach.getDailyFortune());
			
			// Properties Thru Config
			System.out.println("Email: " + theCoach.getEmail());
			System.out.println("Team: " + theCoach.getTeam());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}