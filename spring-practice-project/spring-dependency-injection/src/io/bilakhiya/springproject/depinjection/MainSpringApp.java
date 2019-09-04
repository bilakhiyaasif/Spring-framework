package io.bilakhiya.springproject.depinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext classpathappContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Player p1 = classpathappContext.getBean("Player",Player.class);
		System.out.println("--Log :Calling playerNameList() method.....");
		System.out.println(p1.playerNameList());
		
		p1 = classpathappContext.getBean("Player2",Player.class);
		System.out.println(p1.playerNameList());
		
		p1 = classpathappContext.getBean("Player3",Player.class);
		System.out.println(p1.playerNameList());
		
		classpathappContext.close();
	}

}
