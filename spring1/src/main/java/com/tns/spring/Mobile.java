package com.tns.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config......Loaded");
		
		Sim a=c.getBean("sim",Sim.class);
		a.Calling();
		a.Data();
		

	}

}
