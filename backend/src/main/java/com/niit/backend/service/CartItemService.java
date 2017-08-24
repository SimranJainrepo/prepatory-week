package com.niit.backend.service;

import com.niit.backend.model.Cart;
import com.niit.backend.model.CartItem;

public interface CartItemService {
	void addCartItem(CartItem cartItem);
	void removeCartItem(int cartItemId);
	public void removeAllCartItems(int cartId);
	Cart getCart(int cartId);

}
