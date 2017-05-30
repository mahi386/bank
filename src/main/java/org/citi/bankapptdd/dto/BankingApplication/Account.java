package org.citi.bankapptdd.dto.BankingApplication;

public class Account {
	private String accountName;
	private Long customerId;
	private double balance;
	private String accountNumber;
	
	public Account(){
		
	}
	public Account(String accountName, Long customerId, double balance, String accountNumber) {
		super();
		
		this.accountName=accountName;
		
		this.customerId = customerId;
		
		this.balance = balance;
		
		this.accountNumber=accountNumber;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
