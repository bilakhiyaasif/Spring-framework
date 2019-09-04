package io.bilakhiya.springproject;

public class CricketCoach implements Coach {
	
	public String getDailyWorkout()
	{
		return "Please throw the Cricket ball to the player off side!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "CricketCoach_getDailyFortune()";
	}

}
