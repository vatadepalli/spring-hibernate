package com.app.dao;

import java.util.List;

import com.app.entities.Customer;

public interface ICustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
	
}
