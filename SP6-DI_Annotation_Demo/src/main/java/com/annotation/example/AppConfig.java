package com.annotation.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.annotation.example")
public class AppConfig {

	public Person getPerson()
	{
		System.out.println("Inside AppConfig");
		return new Person();
		
	}
}
