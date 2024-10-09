package com.sp.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Student {

	private String name;
	private int rollno;
	@Autowired
	@Qualifier("addrObj2")
	private Address address;
	@Autowired
	@Qualifier("sub2")
	private Subjects subject;
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Subjects getSubject() {
		return subject;
	}

	public void setSubject(Subjects subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", " + address + ", " + subject + "]";
	}

	
	
}
