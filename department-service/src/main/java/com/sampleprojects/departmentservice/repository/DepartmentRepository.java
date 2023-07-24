package com.sampleprojects.departmentservice.repository;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

import com.sampleprojects.departmentservice.model.Department;

@Repository
public class DepartmentRepository {
	 	private List<Department> departments=new ArrayList<>();
	 	public Department addDepartment(Department department) {
	 		departments.add(department);
	 		return department;
	 	}
	 	public Department findById(Long id) {
	 		return departments.stream()
	 				.filter(department->department.getId().equals(id))
					.findFirst()
					.orElseThrow();
	 	}
	 	public List<Department> findAll(){
	 		return departments;
	 	}
}
