package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 minutes on batting practice";
	}
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService TheFortuneService) {
		this.fortuneService = TheFortuneService;
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune
		return this.fortuneService.getFortune();
	}
}
