package com.first;

public class HelloBean {
	private String name;

	public HelloBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HelloBean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloBean [name=" + name + "]";
	}
	

}
