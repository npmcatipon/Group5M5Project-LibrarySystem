package com.group5.model;

public class Loan {

	private String id;
	private String userId;
	private String bookId;
	
	private Book book;
	private User user;
	
	public Loan() {}
	
	public Loan(String loanId, String userId, String bookId) {
		super();
		this.id = loanId;
		this.userId = userId;
		this.bookId = bookId;
	}
	
	
	public Loan(String loanId, Book book, User user) {
		super();
		this.id = loanId;
		this.book = book;
		this.user = user;
	}

	public String getLoanId() {
		return id;
	}
	public void setLoanId(String loanId) {
		this.id = loanId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
}
