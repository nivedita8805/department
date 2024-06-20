package com.department.department.service;

import java.util.List;

import com.department.department.entity.Department;

public interface DepartmentService {

	Department saveDepartmentData(Department department);
	List<Department> feachDepartmentList();
	Department upadateDeapartmentData(Department department, Long departmentId);
	void DeleteDepartment(Long departmentId);
}
