package com.niit.backend.dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Cart;
import com.niit.backend.model.CartItem;
import com.niit.backend.model.Customer;
import com.niit.backend.model.CustomerOrder;

@Repository
public class CustomerOrderDaoImpl implements CustomerOrderDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private CartItemDao cartItemDao;

	public CustomerOrder createOrder(Cart cart) {
		Session session = sessionFactory.getCurrentSession();
		//Cart cart = (Cart) session.get(Cart.class, cartId);
		List<CartItem> cartItems = cart.getCartItems();
		double grandTotal = 0;
		for (CartItem cartItem : cartItems) {
			grandTotal = cartItem.getTotalPrice() + grandTotal;
		}
		cart.setGrandTotal(grandTotal);
		Customer customer = cart.getCustomer();
		CustomerOrder customerOrder = new CustomerOrder();
		customerOrder.setPurchaseDate(new Date(0));
		customerOrder.setCart(cart);
		customerOrder.setCustomer(customer);
		customerOrder.setBillingAddress(customer.getBillingAddress());
		customerOrder.setShippingAddress(customer.getShippingAddress());
		session.save(customerOrder);// insert, also execute update queries for
									// other tables
		return customerOrder;
	}

}
