package org.citi.bankapptdd.controller.BankingApplication;

import static org.mockito.Mockito.doThrow;

import org.citi.bankapptdd.service.BankingApplication.AccountService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AccountControllerTest {
	
	@InjectMocks
	AccountController accountController = new AccountController();
	@Mock
	AccountService accountService;
	
	@Test(expected = RuntimeException.class)
	public void getUserAccountTest(){
		doThrow(new RuntimeException("Getting User Account details not implemented "))
		.when(accountService).getUserAccount("N1222222", 100000L);
		
		//Assert.assertFalse(accountService.getUserAccount("", 100000L));
	}
	@Test
	public void transferTest(){
		Assert.assertFalse(accountService.transfer(0L, "", 10000, ""));
	}
	@Test(expected = RuntimeException.class)
	public void createAccountTest(){
		doThrow(new RuntimeException("Implementation is not there test failed"))
		.when(accountService).createAccount(1111L, "Mahesh", "N090386", 800.0);
	}
}
