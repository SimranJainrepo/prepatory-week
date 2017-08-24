package com.niit.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.dao.CartItemDao;
import com.niit.backend.model.Cart;
import com.niit.backend.model.CartItem;
@Service("cartService")
@Transactional
public class CartItemServiceImpl implements CartItemService{
	@Autowired
	private CartItemDao cartItemDao;

	public void addCartItem(CartItem cartItem) {
		
		 cartItemDao.addCartItem(cartItem);
	}

	public void removeCartItem(int cartItemId) {
		
		 cartItemDao.removeCartItem(cartItemId);
	}

	public void removeAllCartItems(int cartId) {
		 cartItemDao.removeAllCartItem(cartId);
		
	}

	public Cart getCart(int cartId) {
		return cartItemDao.getCart(cartId);
	}

}
