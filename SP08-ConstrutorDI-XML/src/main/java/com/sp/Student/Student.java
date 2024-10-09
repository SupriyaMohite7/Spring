package com.sp.Student;

public class Student {

	private String name;
	private int rollno;
	private Address address;
	
	
	public Student(String name, int rollno, Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", " + address + "]";
	}
	
	
	
}
