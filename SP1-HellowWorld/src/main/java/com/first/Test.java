package com.first;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");
		HelloBean hobj=(HelloBean) context.getBean("hb1");
		System.out.println(hobj);
	}

}
