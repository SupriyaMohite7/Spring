package com.annotation.example;

import org.springframework.stereotype.Service;

@Service
public class MyService {
Person person;
public void dostuff()
{
	person.sayHello();
}
}
