package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IDepartmentDAO;
import com.app.entities.Department;

@Service
public class DepartmentServiceImpl implements IDepartmentService {
	
	// Inject Department DAO
	
	@Autowired
	private IDepartmentDAO departmentDAO;

	@Override
	@Transactional
	public List<Department> getDepartments() {
		
		return departmentDAO.getDepartments();
	}

	@Override
	@Transactional
	public void saveDepartment(Department department) {
		// TODO Auto-generated method stub
		
		departmentDAO.saveDepartment(department);
		
	}

}
