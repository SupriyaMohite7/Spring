package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext cxt = new AnnotationConfigApplicationContext(Employee.class,Department.class);
		Employee e1 = (Employee) cxt.getBean(Employee.class);
		System.out.println(e1);
	}

}
