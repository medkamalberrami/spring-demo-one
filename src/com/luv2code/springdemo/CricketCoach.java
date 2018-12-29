package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	

	private FortuneService fortuneService;
	private String emailAdresse;
	private String team;

	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg Constructor ");
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast Bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	public void setEmailAdresse(String emailAdresse) {
		this.emailAdresse = emailAdresse;
		System.out.println("CricketCoach: inside setter method - setEmailAdress");

	}


	public void setTeam(String team) {
		this.team = team;
		System.out.println("CricketCoach: inside setter method - setTeam");

	}


	public String getEmailAdresse() {
		return emailAdresse;
	}


	public String getTeam() {
		return team;
	}

}
