package com.sp.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		Student s1 = (Student)context.getBean("stdId1");
		System.out.println(s1);
		
		  Student s2 = (Student)context.getBean("stdId2"); 
		  System.out.println(s2);
		  
		  Student s3 = (Student)context.getBean("stdId3"); 
		  System.out.println(s3);
		 
	}

}
