package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		Employee e1 = (Employee)cxt.getBean("emp");
		System.out.println(e1);
	}

}
