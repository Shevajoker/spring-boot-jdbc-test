package com.jdbc.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.start.model.Department;
import com.jdbc.start.service.DepartmentService;

@RestController
@RequestMapping("/")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("/all")
	public List<Department> testGetAllDepartment(){
		return departmentService.findAll();
	}
	
	@GetMapping("/getDepartment/{id}")
	public Department getDepartmentById(@PathVariable("id") int id) {
		
		return departmentService.findDepartmentById(id);
	}
	
	
}
