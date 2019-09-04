package io.bilakhiya.springproject.depinjection;

public class KabbadiPlayer implements Player{

	
	private ServiceForTimeStart serviceForTimeStart;
	public KabbadiPlayer(ServiceForTimeStart serviceForTimeStart)
	{
		this.serviceForTimeStart = serviceForTimeStart;
	}
	
	public String PlayShedular()
	{
		return "Kabbadi will start within 10 Minutes .....!";
	}

	@Override
	public String playerNameList() {
		// TODO Auto-generated method stub
		//return "Player Name List :"+"Kabbadi".toUpperCase();
		String reference_var_Class = "\nClass Name is :"+serviceForTimeStart.getClass();
		String return_var1 = serviceForTimeStart.startTime();
		String return_var2 = serviceForTimeStart.CityName() ;
		String return_var3 = serviceForTimeStart._3rdtimeConstructor();
		return return_var1 + return_var2 + return_var3 + reference_var_Class;
		
		
	}
}
