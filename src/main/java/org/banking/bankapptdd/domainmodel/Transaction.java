package org.citi.bankapptdd.domainmodel;

import java.util.Date;

public class Transaction {
	private Long idTransaction;
    private String transactionType;
    private int amount;
    private Date transactionDate;
    
    public Account account;
    
    public TransactionDetail transactionDetail;
    
	public Transaction(String transactionType, int amount, Date transactionDate, Account account) {
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.account = account;
	}
	
	public Transaction(Long idTransaction, String transactionType, int amount, Date transactionDate, Account account) {
		this.idTransaction = idTransaction;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.account = account;
	}
	
	public Transaction(String transactionType, int amount, Date transactionDate, TransactionDetail transactionDetail) {
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.transactionDetail = transactionDetail;
	}
	
	public Long getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(Long idTransaction) {
		this.idTransaction = idTransaction;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
    
    
}
