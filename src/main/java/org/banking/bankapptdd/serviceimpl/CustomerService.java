package org.citi.bankapptdd.serviceimpl;

import org.citi.bankapptdd.domainmodel.Customer;



public interface CustomerService {
	public Customer getCustomerById(long customerId);
	public Customer createCustomer(String firstName, String lastName, Long Ssn, String street, String city, String country, String zipCode);
}
