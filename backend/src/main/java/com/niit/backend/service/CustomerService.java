package com.niit.backend.service;

import com.niit.backend.model.Customer;
import com.niit.backend.model.User;

public interface CustomerService {
	void registerCustomer(Customer customer);

	User validateUsername(String username);

	Customer validateEmail(String email);

	Customer getCustomerByUsername(String username);
}
