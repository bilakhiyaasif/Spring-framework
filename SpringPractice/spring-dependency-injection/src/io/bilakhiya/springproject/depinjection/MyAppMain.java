package io.bilakhiya.springproject.depinjection;

public class MyAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p1 = new CricketPlayer();
		//Player p2 = new KabbadiPlayer();
		
		System.out.println(p1.PlayShedular());
		//System.out.println(p2.PlayShedular());
		
	}

}
