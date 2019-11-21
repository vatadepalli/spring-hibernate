package com.app.dao;

import java.util.List;

import com.app.entities.Department;

public interface IDepartmentDAO {

	public List<Department> getDepartments();

	public void saveDepartment(Department department);

}
