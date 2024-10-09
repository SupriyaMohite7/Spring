package com.demo.bookauthor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	@Value("101")
	private int bid;
	@Value("Success")
	private String bname;
	@Value("1000")
	private double bcost;
	@Autowired
	private Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String bname, double bcost, Author author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bcost = bcost;
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBcost() {
		return bcost;
	}
	public void setBcost(double bcost) {
		this.bcost = bcost;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bcost=" + bcost + ", author=" + author + "]";
	}
	
}
