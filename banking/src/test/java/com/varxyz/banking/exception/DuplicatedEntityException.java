package com.varxyz.banking.exception;

public class DuplicatedEntityException extends RuntimeException {
	public DuplicatedEntityException(String msg){
		super(msg);
	}
}
