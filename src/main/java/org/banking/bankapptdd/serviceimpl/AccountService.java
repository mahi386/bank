package org.citi.bankapptdd.serviceimpl;

import java.util.List;

import org.citi.bankapptdd.domainmodel.Account;
import org.citi.bankapptdd.domainmodel.Customer;

public interface AccountService {

	public Account getUserAccount(Long accountId, Long customerId);
	public void createAccount(long id, String accountName, String accountType);
	public boolean transfer(Long customerId, final int amountTransfer, Long from, Long to);
	public List<Account> listAccounts();
	public Customer getUserAccounts(Long customerId);
	
}
