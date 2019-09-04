package io.bilakhiya.springproject.depinjection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GameTimeHandler implements ServiceForTimeStart{

	public String startTime()
	{
		Date date = new Date();
		return "Game Time is started ....."+date;
	}

	@Override
	public String CityName() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String _3rdtimeConstructor() {
		// TODO Auto-generated method stub
		return "";
	}
}
