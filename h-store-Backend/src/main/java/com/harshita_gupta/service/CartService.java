package com.harshita_gupta.service;

import java.util.List;

import com.harshita_gupta.controller.ProductNotFound;
import com.harshita_gupta.exception.CartItemNotFound;
import com.harshita_gupta.models.Cart;
import com.harshita_gupta.models.CartDTO;
import com.harshita_gupta.models.CartItem;




public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
