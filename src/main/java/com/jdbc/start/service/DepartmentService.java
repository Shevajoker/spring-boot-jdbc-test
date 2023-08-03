package com.jdbc.start.service;

import java.util.List;

import com.jdbc.start.model.Department;

public interface DepartmentService {

	public List<Department> findAll();
	public Department findDepartmentById(int id);
	
}
