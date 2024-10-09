package com.sp.Student;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sp.Student")
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		Student s1 = (Student)context.getBean(Student.class);
		System.out.println(s1);
		
	}

}
