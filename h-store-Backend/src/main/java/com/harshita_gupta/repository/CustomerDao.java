package com.harshita_gupta.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshita_gupta.models.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	
	Optional<Customer> findByMobileNo(String mobileNo);
	
	Optional<Customer> findByEmailId(String emailId);
	
	Optional<Customer> findByMobileNoOrEmailId(String mobileNo, String emailId);
	
}
