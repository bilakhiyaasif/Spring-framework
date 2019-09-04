package io.bilakhiya.springproject.depinjection;

public class CricketPlayer implements Player {

	public String PlayShedular()
	{
		return "Cricket will start within 10 Minutes .....!";
	}

	@Override
	public String playerNameList() {
		// TODO Auto-generated method stub
		return "Player Name List :"+"Cricket".toUpperCase();
	}
}
