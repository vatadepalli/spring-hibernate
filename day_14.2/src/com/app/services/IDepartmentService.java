package com.app.services;

import java.util.List;

import com.app.entities.Department;

public interface IDepartmentService {

	List<Department> getDepartments();

	void saveDepartment(Department department);

}
