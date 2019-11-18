package com.app.coaches;

import com.app.fortune.FortuneService;

public class BaseballCoach implements Coach {

	// Define a private field for fortune
	private FortuneService fortuneService;

	// Define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//Use my fortuneService to get fortune
		return fortuneService.getFortune();
	}

}
