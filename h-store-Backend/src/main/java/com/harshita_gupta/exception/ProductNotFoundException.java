package com.harshita_gupta.exception;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductNotFoundException(String message){
		super(message);
	}
}
