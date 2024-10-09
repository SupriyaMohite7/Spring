package com.demo.bookauthor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBook {

	public static void main(String[] args) {

		ApplicationContext cxt = new AnnotationConfigApplicationContext(Book.class,Author.class);
		Book b1 = (Book) cxt.getBean(Book.class);
		System.out.println(b1);
		
	}

}
