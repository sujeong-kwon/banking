package com.varxyz.banking.service;

import java.util.List;

import com.varxyz.banking.dao.CustomerDao;
import com.varxyz.banking.domain.Customer;

public class CustomerService {
	
	private CustomerDao customerDao;
	
	public CustomerService(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public Customer createCustomer(String name, String ssn, String phone, String userId, String passwd) {
		return new Customer(name, ssn, phone, userId, passwd);
	}
	
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}
	
	public Customer getCustomerBySsn(String ssn) {
		return customerDao.findCustomerBySsn(ssn);
	}
	
	public List<Customer> getAllCustomers(){
		return customerDao.findAllCustomers();
	}
}
