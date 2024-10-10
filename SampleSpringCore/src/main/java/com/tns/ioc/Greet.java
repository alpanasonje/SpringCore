package com.tns.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Greet {
	public Greet()
	{
		System.out.println("Default Constructor in Greet");
	}
	public String sayHello() {
		return "Hello Students!!";
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("Initializing Greet..");
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("Destroying Greet....");
	}
}
