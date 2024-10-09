package com.annotation.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		Person p = (Person) ctx.getBean("person");
		p.sayHello();
	}

}
