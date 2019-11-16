package com.app.springdemo;

import com.app.fortune.FortuneService;

public class SwimCoach implements Coach {
	
	private String email = "swimcoach@gmail.com";
	private String team = "The Mermaids";
	
	private FortuneService fortuneService;
	
	// Constructor
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return this.team;
	}

}
