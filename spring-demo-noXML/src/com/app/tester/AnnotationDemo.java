package com.app.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.springdemo.Coach;

public class AnnotationDemo {

	public static void main(String[] args) {
		// Read spring config file
		try(ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			// Get the bean from spring container
			Coach theCoach = ctx.getBean("tennisCoach", Coach.class);
			
			// call a method on the bean
			System.out.println(theCoach.getDailyWorkout());
			
			// daily fortune
			System.out.println(theCoach.getDailyFortune());
			
			// property loading
			System.out.println("Team: " + theCoach.getTeam());
			System.out.println("Email: " + theCoach.getEmail());
			
			
			// Scope Verification
			Coach alphaCoach = ctx.getBean("tennisCoach", Coach.class);
			
			System.out.println();
			System.out.println("Memory Locaton for theCoach: "  + theCoach);
			System.out.println("Memory Locaton for alphaCoach: " + alphaCoach);
			
			boolean result = (theCoach == alphaCoach);
			System.out.println("\nPointing to the same object: "+ result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}