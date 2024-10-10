package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tns.di.Employee;

public class Demo {

	public static void main(String[] args) {

		Greet o = new Greet();
  
 
	ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
 System.out.println("ok");
 //Greet o1 =ac.getBean(Greet.class);
 Greet o1 =(Greet) ac.getBean("obj");
 Greet o2=ac.getBean("obj"	,Greet.class);
System.out.println(o1.sayHello());
System.out.println(o2.sayHello());
System.out.println(o1==o2);
		
	Employee e=ac.getBean("empOne",Employee.class);
	System.out.println(e);

	Employee e1=ac.getBean("empTwo", Employee.class);
	System.out.println(e1);
	
	Employee e2=ac.getBean("empThree", Employee.class);
	System.out.println(e2);
	
	}

}
