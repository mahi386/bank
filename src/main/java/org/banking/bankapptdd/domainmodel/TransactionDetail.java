package org.citi.bankapptdd.domainmodel;

public class TransactionDetail {
	private Long id;
    private Long debitedAccount;
    private Long creditedAccount;
    private Long idTransaction;
    
    public TransactionDetail(){
    	
    }
    
    public TransactionDetail(Long id,Long from, Long to, Long idTransaction){
    	this.id = id;
    	this.debitedAccount = from;
    	this.creditedAccount = to;
    	this.idTransaction = idTransaction; 	
    }
    
    public static TransactionDetail transactionDetail(){
    	return transactionDetail();
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDebitedAccount() {
		return debitedAccount;
	}
	public void setDebitedAccount(Long debitedAccount) {
		this.debitedAccount = debitedAccount;
	}
	public Long getCreditedAccount() {
		return creditedAccount;
	}
	public void setCreditedAccount(Long creditedAccount) {
		this.creditedAccount = creditedAccount;
	}
	public Long getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(Long idTransaction) {
		this.idTransaction = idTransaction;
	}
    
    
}
