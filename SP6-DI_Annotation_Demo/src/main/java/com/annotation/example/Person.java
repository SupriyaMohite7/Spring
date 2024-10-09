package com.annotation.example;

import org.springframework.stereotype.Component;

@Component
public class Person {

	public void sayHello()
	{
		System.out.println("Person is saying Hello");
	}
	
}
