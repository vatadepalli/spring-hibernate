package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDAO{
	
	// Inject Session Factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		// Get Current Hibernate Session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Create a Query
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		
		// Execute the Query
		List<Customer> customers = theQuery.getResultList();
		
		// Return the list of customers
		return customers;
	}

}
