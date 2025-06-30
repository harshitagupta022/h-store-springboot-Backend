package com.harshita_gupta.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshita_gupta.models.Seller;

public interface SellerDao extends JpaRepository<Seller, Integer> {
	
	Optional<Seller> findByMobile(String mobile);
	
}
