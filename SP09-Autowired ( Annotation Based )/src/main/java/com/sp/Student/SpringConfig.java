package com.sp.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Address addrObj()
	{
		Address adr = new Address();
		adr.setHouseno(100);
		adr.setCity("Banglore");
		adr.setPincode(154789);
		return adr;
	}
	@Bean
	public Address addrObj2()
	{
		Address adr = new Address();
		adr.setHouseno(1000);
		adr.setCity("Pune");
		adr.setPincode(411017);
		return adr;
	}
	@Bean
	public Student stdObj()
	{
		Student std = new Student();
		std.setRollno(007);
		std.setName("Pratik");
//		std.setAddress(addrObj());		manual DI
//		std.setSubject(sub());			manual DI
		return std;
	}
	@Bean
	public Subjects sub()
	{
		Subjects sub = new Subjects();
		List<String> subList = new ArrayList<String>();
		subList.add("Java");
		subList.add("C++");
		subList.add("C");
		sub.setSubjects(subList);
		return sub;
		
	}
	@Bean
	public Subjects sub2()
	{
		Subjects sub = new Subjects();
		List<String> subList = new ArrayList<String>();
		subList.add("Networking");
		subList.add("Database");
		subList.add("Python");
		sub.setSubjects(subList);
		return sub;
		
	}
}
