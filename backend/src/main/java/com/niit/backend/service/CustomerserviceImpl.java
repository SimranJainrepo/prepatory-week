package com.niit.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.dao.CustomerDao;
import com.niit.backend.model.Customer;
import com.niit.backend.model.User;

@Service("customerService")
@Transactional
public class CustomerserviceImpl implements CustomerService
{
	@Autowired
private CustomerDao customerDao;
	
	public void registerCustomer(Customer customer) {
		customerDao.registerCustomer(customer);
		
	}

	public User validateUsername(String username) {
		
		return customerDao.validateUsername(username);
	}

	public Customer validateEmail(String email) {
		
		return customerDao.validateEmail(email);
	}

	public Customer getCustomerByUsername(String username) {
	return customerDao.getCustomerByUsername(username);
	}
}
