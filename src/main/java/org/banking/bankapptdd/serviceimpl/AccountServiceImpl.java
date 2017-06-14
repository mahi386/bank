package org.citi.bankapptdd.serviceimpl;

import java.util.List;

import org.citi.bankapptdd.domainmodel.Account;
import org.citi.bankapptdd.domainmodel.Customer;
import org.springframework.stereotype.Service;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {

	@Override
	public Account getUserAccount(Long accountId, Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAccount(long id, String accountName, String accountType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean transfer(Long customerId, int amountTransfer, Long accountId, Long recepientAccountId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> listAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getUserAccounts(Long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
