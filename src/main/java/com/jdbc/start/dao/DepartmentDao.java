package com.jdbc.start.dao;

import java.util.List;

import com.jdbc.start.model.Department;

public interface DepartmentDao {

	public List<Department> findAll();
	public Department findDepartmentById(int id);
	
}
