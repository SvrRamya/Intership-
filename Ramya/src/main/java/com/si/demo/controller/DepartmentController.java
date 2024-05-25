package com.si.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.si.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentService S1;
	
	@PostMapping("/departments")
     public Department saveDepartment(@RequestBody Department department) {
	       
	        return S1.save(department);
	    }
	@GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return S1.fetchDepartmentList();
    }
	@GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)
            {
        return S1.fetchDepartmentById(departmentId);
    }
	 @DeleteMapping("/departments/{id}")
	    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
	        S1.deleteDepartmentById(departmentId);
	        return "Department deleted Successfully!!";
	    }
	 @PutMapping("/departments/{id}")
	    public Department updateDepartment(@PathVariable("id") Long departmentId,
	                                       @RequestBody Department department) {
	        return S1.updateDepartment(departmentId,department);
	    }

}

