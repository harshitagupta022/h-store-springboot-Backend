package com.harshita_gupta.service;

import com.harshita_gupta.models.CartDTO;
import com.harshita_gupta.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
