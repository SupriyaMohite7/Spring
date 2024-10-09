package com.demo.bookauthor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Author {

	@Value("1")
	private int aid;
	@Value("Dr. Dinesh Shaha")
	private String aname;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + "]";
	}
	
}
