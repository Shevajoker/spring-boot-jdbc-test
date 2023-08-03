package com.jdbc.start.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.jdbc.start.model.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{

	private static final String SQL_GET_ALL_DEPARTMENTS = "SELECT d.department_id, d.depatrtment_name, d.department_preority FROM department AS d ORDER BY d.depatrtment_name";
	private static final String SQL_GET_DEPARTMENT_BY_ID = "SELECT d.department_id, d.depatrtment_name, d.department_preority FROM department AS d WHERE d.department_id = :id LIMIT 1";
	
	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	
	public DepartmentDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	

	@Override
	public List<Department> findAll() {
		
		return namedParameterJdbcTemplate.query(SQL_GET_ALL_DEPARTMENTS, new DepartmentRowMaper());
	}
	
	
	@Override
	public Department findDepartmentById(int id) {
	
		SqlParameterSource parameterSource = new MapSqlParameterSource("id", id);
		
		return namedParameterJdbcTemplate.queryForObject(SQL_GET_DEPARTMENT_BY_ID, parameterSource, new DepartmentRowMaper());
	}
	
	
	
	private class DepartmentRowMaper implements RowMapper<Department>{
		@Override
		public Department mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Department department = new Department();
			department.setId(resultSet.getInt("department_id"));
			department.setName(resultSet.getString("depatrtment_name"));
			department.setPreority(resultSet.getInt("department_preority"));
			
			return department;
		}
	}
	
}
