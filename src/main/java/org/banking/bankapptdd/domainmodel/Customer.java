package org.citi.bankapptdd.domainmodel;

import java.util.List;

public class Customer {
	
	private Long idCustomer;

    private String firstName;
    
    private String lastName;
    
    private Long sSN;

    private String street;

    private String city;

    private String country;

    private String zipCode;
    
    private List<Account> accounts;
    
	public Customer(Long idCustomer, String firstName, String lastName, Long sSN, String street, String city, String country, String zipCode) {
		this.idCustomer = idCustomer;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sSN = sSN;
		this.street = street;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}
	
	public Customer(String firstName, String lastName, Long sSN, String street, String city, String country, String zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sSN = sSN;
		this.street = street;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}
	
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Long getsSN() {
		return sSN;
	}

	public void setsSN(Long sSN) {
		this.sSN = sSN;
	}

	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}
	
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
