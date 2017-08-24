package com.niit.backend.dao;

import com.niit.backend.model.Cart;
import com.niit.backend.model.CartItem;

public interface CartItemDao {
	void addCartItem(CartItem cartItem);
	void removeCartItem(int cartItemId);
	public void removeAllCartItem(int cartId);
	public Cart getCart(int cartId);
}
