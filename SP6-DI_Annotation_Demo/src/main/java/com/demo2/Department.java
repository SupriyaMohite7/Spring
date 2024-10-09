package com.demo2;

import org.springframework.beans.factory.annotation.Value;

public class Department {


	@Value("1")
	private int did;
	@Value("HR")
	private String dname;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
	
}
