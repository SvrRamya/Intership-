package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Department;

public interface DepartmentService {

	public Department save(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	
}
