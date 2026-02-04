package com.group5.service;

import com.group5.exception.DuplicateLoanIdException;

public interface LoanService {

		String findLoanId(String loanId) throws DuplicateLoanIdException;
		void addLoanBook(String loanId, String bookId, String userId);
}
