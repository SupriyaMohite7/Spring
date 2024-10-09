package com.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.setter.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		System.out.println(e1);
	}

}
