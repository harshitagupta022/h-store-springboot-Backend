package com.harshita_gupta.exception;

public class SellerNotFoundException extends RuntimeException{
	
	public SellerNotFoundException() {
		super();
	}
	
	
	public SellerNotFoundException(String message) {
		super(message);
	}
}
