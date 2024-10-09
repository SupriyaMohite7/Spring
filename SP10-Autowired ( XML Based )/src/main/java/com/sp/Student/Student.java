package com.sp.Student;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	private int rollno;
	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int rollno, Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}

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
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", address=" + address + "]";
	}
	
	
}
