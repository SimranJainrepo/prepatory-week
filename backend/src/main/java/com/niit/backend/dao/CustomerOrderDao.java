package com.niit.backend.dao;

import com.niit.backend.model.Cart;
import com.niit.backend.model.CustomerOrder;

public interface CustomerOrderDao {

	CustomerOrder createOrder(Cart cart);

}
