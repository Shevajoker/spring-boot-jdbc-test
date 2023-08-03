package com.jdbc.start.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.start.dao.DepartmentDao;
import com.jdbc.start.model.Department;

@Service
public class DeparnmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentDao departmentDao;
	
	
	@Override
	public List<Department> findAll() {
		return departmentDao.findAll();
	}


	@Override
	public Department findDepartmentById(int id) {
		return departmentDao.findDepartmentById(id);
	}

	
	
}
