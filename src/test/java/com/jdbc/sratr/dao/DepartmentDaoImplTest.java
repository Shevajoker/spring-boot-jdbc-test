package com.jdbc.sratr.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jdbc.start.JdbcTestApplication;
import com.jdbc.start.dao.DepartmentDao;
import com.jdbc.start.model.Department;

@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = SpringBootTest.WebEnvironment.MOCK,
  classes = JdbcTestApplication.class)
@AutoConfigureMockMvc
class DepartmentDaoImplTest {

	@Autowired
	private DepartmentDao departmentDao;
	
	@Test
	public void findAllTest() {
		
		List<Department> departments = departmentDao.findAll();
		Assert.assertNotNull(departments);
		Assert.assertTrue(departments.size() > 0);
	}

	@Test
	public void findDepartmentById() {
		int id = 1;
		
		Department department = departmentDao.findDepartmentById(id);
		
		Assert.assertNotNull(department);
		Assert.assertEquals("Error message!", "Sales", department.getName());
	}
	
}
