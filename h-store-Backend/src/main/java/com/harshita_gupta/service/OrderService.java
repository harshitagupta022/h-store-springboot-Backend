package com.harshita_gupta.service;

import java.time.LocalDate;
import java.util.List;

import com.harshita_gupta.exception.CustomerNotFoundException;
import com.harshita_gupta.exception.LoginException;
import com.harshita_gupta.exception.OrderException;
import com.harshita_gupta.models.Customer;
import com.harshita_gupta.models.Order;
import com.harshita_gupta.models.OrderDTO;

public interface OrderService {
	public Order saveOrder(OrderDTO odto,String token) throws LoginException, OrderException;
	
	public Order getOrderByOrderId(Integer OrderId) throws OrderException;
	
	public List<Order> getAllOrders() throws OrderException;
	
	public Order cancelOrderByOrderId(Integer OrderId,String token) throws OrderException;
	
	public Order updateOrderByOrder(OrderDTO order,Integer OrderId,String token) throws OrderException,LoginException;
	
	public List<Order> getAllOrdersByDate(LocalDate date) throws OrderException;

	public Customer getCustomerByOrderid(Integer orderId) throws OrderException;
	
	//public Customer getCustomerIdByToken(String token) throws CustomerNotFoundException;
	

	
}
