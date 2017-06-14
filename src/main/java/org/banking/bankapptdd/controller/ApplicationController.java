package org.citi.bankapptdd.controller;

import java.util.List;

import org.citi.bankapptdd.domainmodel.Account;
import org.citi.bankapptdd.domainmodel.Customer;
import org.citi.bankapptdd.domainmodel.Transaction;
import org.citi.bankapptdd.serviceimpl.AccountService;
import org.citi.bankapptdd.serviceimpl.AccountServiceImpl;
import org.citi.bankapptdd.serviceimpl.CustomerService;
import org.citi.bankapptdd.serviceimpl.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bankApplication")
public class ApplicationController {
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private TransactionService transactionService;
	
	 /*@RequestMapping(value = "/", method = RequestMethod.GET)
	 public String hello(){
		 return "Mahesh";
	 }*/
	
	 @RequestMapping(value = "/account/{accountId}/customer/{customerId}", method = RequestMethod.GET, produces = "application/json")
	 public Account getUserAccount(@PathVariable("accountId") Long accountId, @PathVariable("customerId") Long customerId) {
	        return accountService.getUserAccount(accountId, customerId);
	 }
	 
	 @RequestMapping(value = "/create/{customerId}", method = RequestMethod.POST)
	 public void createAccount(@PathVariable("customerId") long id, @RequestParam(value = "accountName", required = true) String accountName, @RequestParam(value = "accountType", required = true) String accountType) {
	        accountService.createAccount(id, accountName, accountType);
	 }
	 
	 @RequestMapping(value = "/balance/{customerId}/transfer", method = RequestMethod.PUT)
	 public void transfer(@PathVariable(value = "customerId") Long customerId,
	                          @RequestParam(value = "amount", required = true) final int amountTransfer,
	                          @RequestParam(value = "from", required = true) Long from,
	                          @RequestParam(value = "toTest", required = true) Long to) {
	        accountService.transfer(customerId,amountTransfer,from,to);
	 }
	 
	@RequestMapping(value="/",method=RequestMethod.GET)
	 public List<Account> getAllAccounts(){
		    return accountService.listAccounts();
	 }
	
	 @RequestMapping(value = "/accounts/{customer-id}", method = RequestMethod.GET, produces = "application/json")
     public Customer getUserAccounts(@PathVariable(value = "customer-id") Long customerId) {
		 	return accountService.getUserAccounts(customerId);
	 }
	 
	 @RequestMapping(value = "/transaction/{accountId}", method = RequestMethod.GET, produces = "application/json")
	 public List<Transaction> getAccountTransaction(@PathVariable(value = "accountId") Long accountId) {
	  		return null;
	 }
	 
	 @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET, produces = "application/json")
	 public Customer getCustomerById(@PathVariable("customerId") long customerId) {
	        return customerService.getCustomerById(customerId);
	 }
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	 public Customer createCustomer(@RequestParam(value = "firstName", required = true) String firstName, 
			 						@RequestParam(value = "lastName", required = true) String lastName,
			 						@RequestParam(value = "sSN", required = true) Long sSN,
			 					    @RequestParam(value = "street", required = true) String street,
			 					    @RequestParam(value = "city", required = true) String city,
			 					    @RequestParam(value = "country", required = true) String country,
			 					    @RequestParam(value = "zipcode", required = true) String zipcode) {
		 return customerService.createCustomer(firstName, lastName, sSN, street, city, country, zipcode);
	 }
	 @RequestMapping(value="/transactions/{customerId}", method = RequestMethod.GET)
	 public List<Transaction> getUserTransactions(@PathVariable("customerId") long customerId){
		return transactionService.getUserTransactions(customerId);
	 }
}
