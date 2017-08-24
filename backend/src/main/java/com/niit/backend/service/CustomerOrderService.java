package com.niit.backend.service;

import com.niit.backend.model.Cart;
import com.niit.backend.model.CustomerOrder;


public interface CustomerOrderService {
	CustomerOrder createOrder(Cart cart);
	}
