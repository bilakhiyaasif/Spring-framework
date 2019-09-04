package io.bilakhiya.springproject;

public class TrackCoach implements Coach {
	
	
	
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
	
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it: "+fortuneService.getFortune();
	}
}
