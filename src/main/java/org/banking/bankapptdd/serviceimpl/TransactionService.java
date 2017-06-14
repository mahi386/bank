package org.citi.bankapptdd.serviceimpl;

import java.util.List;

import org.citi.bankapptdd.domainmodel.Transaction;



public interface TransactionService {
	public List<Transaction> getUserTransactions(Long customerId);
}
