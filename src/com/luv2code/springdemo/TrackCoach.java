package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;


	public TrackCoach(FortuneService frotuneService) {
		this.fortuneService = frotuneService;
	}

	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}
	
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartuptuff");
	}

	public void doMyClaenStuffY() {
		System.out.println("TrackCoach: inside method doMyClaenStuffY");
	}
}
