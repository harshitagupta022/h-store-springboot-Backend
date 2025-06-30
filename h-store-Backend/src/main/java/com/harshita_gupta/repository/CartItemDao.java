package com.harshita_gupta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshita_gupta.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
