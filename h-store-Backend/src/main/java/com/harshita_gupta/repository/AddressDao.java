package com.harshita_gupta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshita_gupta.models.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}
