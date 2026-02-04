package com.group5.dao;

import com.group5.exception.DuplicateLoanIdException;

public interface LoanDAO {
	
	String findLoanId (String loanId) throws DuplicateLoanIdException;
	void addLoanBook(String loanId, String bookId, String userId);

}
