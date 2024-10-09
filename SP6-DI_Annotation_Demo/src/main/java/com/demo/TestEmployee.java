package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {

		ApplicationContext cxt = new AnnotationConfigApplicationContext(Employee.class);
		Employee e1 = (Employee)cxt.getBean("employee");
		System.out.println(e1);
	}

}
