package org.citi.bankapptdd.service.BankingApplication;

import java.util.List;
import java.util.Optional;

import org.citi.bankapptdd.dto.BankingApplication.Account;

public interface AccountService {

	public Account getUserAccount(String accountNum, Long customerId);
	public void createAccount(Long customerId, String customerName, String accountNumber, Double balance);
	public boolean transfer(Long customerId, String accountNum, int amountTransfer, String recepientAccontNum);
	public List<Account> getAllAccounts();
	
}
