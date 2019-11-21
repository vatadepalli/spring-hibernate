package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entities.Department;

@Repository
public class DepartmentDAOImpl implements IDepartmentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Department> getDepartments() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Create a Query .. sort by last name
		Query<Department> theQuery = currentSession
								.createQuery("from Department", Department.class);
		
		// Execute the Query
		List<Department> departments = theQuery.getResultList();
		
		// Return the list of customers
		return departments;
	}

	@Override
	public void saveDepartment(Department department) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// save the department
		currentSession.saveOrUpdate(department);	
		
	}

}
