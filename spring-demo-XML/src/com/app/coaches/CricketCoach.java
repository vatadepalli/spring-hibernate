package com.app.coaches;

import com.app.fortune.FortuneService;

public class CricketCoach implements Coach {

	// Fields for Injected Objects
	private FortuneService fortuneService;

	// Fields for Injected Literals
	private String emailAddress, team;

	// No Arg Const
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice fast bowling for 15 minutes.";
	}

	// Setter method for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method - SetFortuneService");
		this.fortuneService = fortuneService;
	}

	// Setters for Injected fields
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method - SetEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method - SetTeam");
		this.team = team;
	}

	// Getters for Tester

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public String getTeam() {
		return this.team;
	}
}
