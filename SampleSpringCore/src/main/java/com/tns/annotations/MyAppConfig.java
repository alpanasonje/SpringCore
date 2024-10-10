package com.tns.annotations;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tns.di.Employee;
import com.tns.ioc.Greet;

@Configuration
public class MyAppConfig {
	@Bean
	public Employee empOne() {
		Long a[] = new Long[] { 7878787800L, 8765467676L };
		ArrayList<Long> contactNos = new ArrayList<Long>();
		contactNos.add(a[0]);
		contactNos.add(a[1]);
		return new Employee(1, "Prajwal", 45000, contactNos);
	}
	
	@Bean
	public Greet greet()
	{
		return new Greet();
	}
}
