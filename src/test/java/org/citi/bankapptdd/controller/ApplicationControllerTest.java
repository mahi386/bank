package org.citi.bankapptdd.controller;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.citi.bankapptdd.domainmodel.Account;
import org.citi.bankapptdd.domainmodel.Customer;
import org.citi.bankapptdd.serviceimpl.AccountService;
import org.citi.bankapptdd.serviceimpl.CustomerService;
import org.citi.bankapptdd.serviceimpl.TransactionService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class ApplicationControllerTest {
	@InjectMocks
	ApplicationController applicationController;
	@Mock
	AccountService accountService;
	@Mock
	CustomerService customerService;
	@Mock
	TransactionService transactionService;
	@Spy
	List<Account> accounts = new ArrayList<Account>();
	
	@Spy
	List<Customer> customers = new ArrayList<Customer>();
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		accounts = listAccounts();
	}
	
	@Test
	public void testGetUserAccount(){
		//doThrow(new RuntimeException("Not yet implemented")).when(accountService.getUserAccount(anyLong(), anyLong()));
		assertEquals(accounts.get(0),accountService.getUserAccount(anyLong(), anyLong()));
	}
	
	@Test
	public void testCreateAccount(){
		//doNothing().when(accountService).createAccount(anyLong(), anyString(), anyString());
		assertEquals(accounts,accountService.listAccounts());	
	}
	
	public List<Account> listAccounts(){
		Account account = new Account();
		account.setId(10000000L);
		account.setBalance(3480.23);
		account.setType("Checking");
		
		Account account1 = new Account();
		account1.setId(100000001L);
		account1.setBalance(1000.0);
		account1.setType("Saving");
		
		accounts.add(account);
		accounts.add(account1);
		return accounts;
	}
	


}
