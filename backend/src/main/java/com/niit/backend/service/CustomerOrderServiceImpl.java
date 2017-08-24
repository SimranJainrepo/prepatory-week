package com.niit.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.dao.CustomerOrderDao;
import com.niit.backend.model.Cart;
import com.niit.backend.model.CustomerOrder;
@Service
@Transactional
public class CustomerOrderServiceImpl implements CustomerOrderService {
	@Autowired
	private CustomerOrderDao customerOrderDao;
		public CustomerOrder createOrder(Cart cart) {
			return customerOrderDao.createOrder(cart);
		}
		
}
