package com.di.setter.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
			Customer e1 = (Customer)context.getBean("c1");
			System.out.println(e1);
	}

}

                                               