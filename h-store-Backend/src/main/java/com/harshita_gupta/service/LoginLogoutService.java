package com.harshita_gupta.service;

import com.harshita_gupta.models.CustomerDTO;
import com.harshita_gupta.models.SellerDTO;
import com.harshita_gupta.models.SessionDTO;
import com.harshita_gupta.models.UserSession;


public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}
