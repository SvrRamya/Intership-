package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Department;
import com.si.demo.repositary.DepartmentRepository;

@Service
public  class DepartmentServiceImp implements DepartmentService {

	@Autowired
	DepartmentRepository R1;

	@Override
	public Department save(Department department) {
		// TODO Auto-generated method stub
		return R1.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return R1.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return R1.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		R1.deleteById(departmentId);
	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
	       Department depDB = R1.findById(departmentId).get();

	       if(Objects.nonNull(department.getDepartmentName()) &&
	       !"".equalsIgnoreCase(department.getDepartmentName())) {
	           depDB.setDepartmentName(department.getDepartmentName());
	       }

	       if(Objects.nonNull(department.getDepartmentCode()) &&
	               !"".equalsIgnoreCase(department.getDepartmentCode())) {
	           depDB.setDepartmentCode(department.getDepartmentCode());
	       }

	       if(Objects.nonNull(department.getDepartmentAddress()) &&
	               !"".equalsIgnoreCase(department.getDepartmentAddress())) {
	           depDB.setDepartmentAddress(department.getDepartmentAddress());
	       }

	       return R1.save(depDB);
	   }
}
