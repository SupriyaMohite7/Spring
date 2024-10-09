package com.sp.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Student stdId1()
	{
		Student std = new Student();
		
		std.setName("Avyay");
		std.setRollno(1);
		std.setEmail("avyay@gmail.com");
		
		return std;
	}
	@Bean
	public Student stdId2()
	{
		Student std = new Student();
		
		std.setName("Naitik");
		std.setRollno(2);
		std.setEmail("naitik@gmail.com");
		
		return std;
	}
	@Bean
	public Student stdId3()
	{
		Student std = new Student();
		
		std.setName("Kiran");
		std.setRollno(3);
		std.setEmail("kiran@gmail.com");
		
		return std;
	}
}
