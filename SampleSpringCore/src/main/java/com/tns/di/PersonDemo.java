package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Person p=ac.getBean("person1", Person.class);
		System.out.println(p);
		Person p1=ac.getBean("person2", Person.class);
		System.out.println(p1);
	}

}
