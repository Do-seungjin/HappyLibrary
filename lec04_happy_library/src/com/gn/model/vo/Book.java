package com.gn.model.vo;

import java.time.LocalDateTime;

public class Book {
	private int book_no;
	private String book_name;
	private String book_author;
	private String book_publisher;
	private LocalDateTime book_publishDate;
	private int book_price;
	private int book_haveAmount;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int book_no, String book_name, String book_author, String book_publisher,
			LocalDateTime book_publishDate, int book_price, int book_haveAmount) {
		super();
		this.book_no = book_no;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_publisher = book_publisher;
		this.book_publishDate = book_publishDate;
		this.book_price = book_price;
		this.book_haveAmount = book_haveAmount;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public LocalDateTime getBook_publishDate() {
		return book_publishDate;
	}
	public void setBook_publishDate(LocalDateTime book_publishDate) {
		this.book_publishDate = book_publishDate;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public int getBook_haveAmount() {
		return book_haveAmount;
	}
	public void setBook_haveAmount(int book_haveAmount) {
		this.book_haveAmount = book_haveAmount;
	}
	@Override
	public String toString() {
		return book_no + "||" + book_name + "||" + book_author
				+ "||" + book_publisher + "||" + book_publishDate + "||"
				+ book_price + "||" + book_haveAmount ;
	}
	
	
	
}
