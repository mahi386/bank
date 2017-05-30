package org.citi.bankapptdd.service.BankingApplication;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.citi.bankapptdd.dto.BankingApplication.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceTest {
	
	
	@Autowired
	private AccountService accountService;
	
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount2() {
		return account2;
	}

	public void setAccount2(Account account2) {
		this.account2 = account2;
	}

	@Autowired
	private Account account;
	
	@Autowired
	private Account account2;
	
	@Before
	public void setUp() throws Exception {
		this.accountService=accountService;
	}

	@Test
	public void testGetUserAccount() {
		account.setAccountName("Mahesh");
		account.setBalance(800.0);
		account.setAccountNumber("N090386");
		account.setCustomerId(10222222L);
		assertEquals(accountService.getUserAccount("N090386", 10222222L),account);
	}

	@Test 
	public void testCreateAccount() {
		account.setCustomerId(120222222L);
		account.setAccountNumber("N090381");
		account.setBalance(800.0);
	}

	@Test
	public void testTransfer() {
		assertEquals(true, accountService.transfer(12222222L, "N090386", 500, "N091119"));
		//assertEquals("Test", "Test");
	}

	@Test
	public void testGetAllAccounts() {
		account.setAccountNumber("N090352");
		account.setCustomerId(10000000L);
		account.setBalance(801.0);
		account2.setAccountNumber("N090380");
		account2.setCustomerId(18888888L);
		account2.setBalance(900.0);
		List<Account> list1 = new ArrayList<Account>();
		list1.add(account);
		list1.add(account2);
		assertEquals(list1, accountService.getAllAccounts());
	}

}
