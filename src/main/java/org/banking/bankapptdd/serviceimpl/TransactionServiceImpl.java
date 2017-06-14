package org.citi.bankapptdd.serviceimpl;

import java.util.List;

import org.citi.bankapptdd.domainmodel.Transaction;
import org.springframework.stereotype.Service;

@Service("TransactionService")
public class TransactionServiceImpl implements TransactionService{

	@Override
	public List<Transaction> getUserTransactions(Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
