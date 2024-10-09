package com.sp.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student s1 = (Student)context.getBean("stud1");
		System.out.println(s1);
		Student s2 = (Student)context.getBean("stud2");
		System.out.println(s2);
		Student s3 = (Student)context.getBean("stud3");
		System.out.println(s3);
	}

}
