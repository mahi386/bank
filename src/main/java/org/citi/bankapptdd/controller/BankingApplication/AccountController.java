package org.citi.bankapptdd.controller.BankingApplication;

import java.util.List;
import java.util.Optional;

import org.citi.bankapptdd.dto.BankingApplication.Account;
import org.citi.bankapptdd.service.BankingApplication.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")


public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/{accountNum}/{customerId}", method=RequestMethod.GET)
	public Account getUserAccount(@PathVariable("accountNum") String accountNum, @PathVariable("customerId") Long customerId){
		return accountService.getUserAccount(accountNum,customerId);
	}
	@RequestMapping(value="/accounts/{customerId}/{accountName}/{balance}/{accountNumber}", method = RequestMethod.POST)
	public void createAccount(@PathVariable("customerId") Long customerId, 
							  @PathVariable("accountName") String accountName, 
							  @PathVariable("balance") Double balance,
							  @PathVariable("accountNumber") String accountNumber){
		accountService.createAccount(customerId, accountName, accountNumber, balance); 
	}
	@RequestMapping(value="/balance/{customerId}/transfer", method = RequestMethod.PUT)
	public boolean transfer(@PathVariable("customerId") Long customerId,
							@RequestParam(value="accountNum", required=true) String accountNum, 
							@RequestParam(value="amount", required = true ) int amountTransfer,
							@RequestParam(value="recepientNum", required = true)  String recepientAccountNum){
		return accountService.transfer(customerId, accountNum, amountTransfer, recepientAccountNum);
	}
	@RequestMapping(value="/accounts",method=RequestMethod.GET)
	public List<Account> getAllAccounts(){
		return accountService.getAllAccounts();
	}
}
