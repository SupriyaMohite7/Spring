package com.di.constructor;

public class Student {

	private int sid;
	private String sname;
	private double smarks;
	public Student() {
	System.out.println("Inside Student default Constructor");	
	}
	public Student(int sid, String sname, double smarks) {
		super();
		System.out.println("Inside Student Para-Constructor");	
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	
	
}
