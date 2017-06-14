package org.citi.bankapptdd.serviceimpl;

import org.citi.bankapptdd.domainmodel.Customer;
import org.springframework.stereotype.Service;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer createCustomer(String firstName, String lastName, Long Ssn, String street, String city,
			String country, String zipCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
