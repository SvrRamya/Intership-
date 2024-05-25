package com.si.demo.repositary;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

		
}
