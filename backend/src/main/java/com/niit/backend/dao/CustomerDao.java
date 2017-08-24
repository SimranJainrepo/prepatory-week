package com.niit.backend.dao;

import com.niit.backend.model.Customer;
import com.niit.backend.model.User;

public interface CustomerDao {
	void registerCustomer(Customer customer);

	User validateUsername(String username);

	Customer validateEmail(String email);
	Customer getCustomerByUsername(String username);
}
