package org.citi.bankapptdd.domainmodel;

public class Account {
	private Long id;
    private double balance = 0;
    private String type;
    
    public Account(){
    	
    }
    
    public Account(double balance, String type){
    	this.balance = balance;
    	this.type = type;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
}
