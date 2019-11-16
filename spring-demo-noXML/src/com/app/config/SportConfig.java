package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.app.fortune.FortuneService;
import com.app.fortune.SadFortuneService;
import com.app.springdemo.Coach;
import com.app.springdemo.SwimCoach;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.app") // Only necessary when bean is not defined (Beans need to be annotated @Component)
public class SportConfig {
	
	// Define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() { // The method name is the bean id
		return new SadFortuneService();
	}
	
	// Define bean for swim coach & inject dependency
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService()); 
		/* The bean method is called as an argument.
		 * Spring will intercept the method and give us reference to the bean.
		*/
		
		return mySwimCoach;
	}
}
