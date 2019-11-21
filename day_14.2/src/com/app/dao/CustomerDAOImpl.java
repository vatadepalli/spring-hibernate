package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
		
		// Create a Query .. sort by last name
		Query<Customer> theQuery = currentSession
								.createQuery("from Customer order by lastName", Customer.class);
		
		// Execute the Query
		List<Customer> customers = theQuery.getResultList();
		
		// Return the list of customers
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save the customer
//		currentSession.save(customer);	
		currentSession.saveOrUpdate(customer);	
	}

	@Override
	public Customer getCustomer(int id) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// retrieve / read from databse using primary key
		return currentSession.get(Customer.class, id);
	
	}

	@Override
	public void deleteCustomer(int id) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with key
		@SuppressWarnings("unchecked")
		Query<Customer> theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", id);
		theQuery.executeUpdate();
		
	}

}
