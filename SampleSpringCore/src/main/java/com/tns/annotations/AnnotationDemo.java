package com.tns.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tns.di.Employee;
import com.tns.ioc.Greet;

public class AnnotationDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyAppConfig.class);
		Greet g=ac.getBean("greet", Greet.class);
		System.out.println(g.sayHello());
		g=null;
		System.out.println(g);
		System.gc();
		
		
		Employee e1=ac.getBean("empOne",Employee.class);
		System.out.println(e1);
		((AbstractApplicationContext) ac).close();
		System.out.println("---------------");
	}

}
