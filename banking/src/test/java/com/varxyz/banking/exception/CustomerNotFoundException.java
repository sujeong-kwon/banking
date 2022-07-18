package com.varxyz.banking.exception;

public class CustomerNotFoundException extends EntityNotFoundException{
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
