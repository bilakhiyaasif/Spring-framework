package io.bilakhiya.springproject;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneService)
	{
		fortuneService = thefortuneService;
	}
	
	
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
