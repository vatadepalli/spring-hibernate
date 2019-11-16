package com.app.coaches;

import com.app.fortune.FortuneService;

public class TrackCoach implements Coach {

	// Declare var for object being Dependency Injetced.
	private FortuneService fortuneService;

	// Constructor for taking in DI var.
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	// Add an init method
	public void initBean() { // Can give any method names
		System.out.println("Track Coach: Inside Method: initBean");
	}

	// Add a destroy method
	public void destroyBean() { // Can give any method names
		System.out.println("Track Coach: Inside Method: destroyBean");
	}
}
