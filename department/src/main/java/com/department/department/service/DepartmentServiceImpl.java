package com.department.department.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.department.entity.Department;
import com.department.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartmentData(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> feachDepartmentList() {
		List<Department> departmentlist = departmentRepository.findAll();
		return departmentlist;
	}

	@Override
	public Department upadateDeapartmentData(Department department, Long departmentId) {
		Department deptData = departmentRepository.findById(departmentId).get();

		if (Objects.nonNull(department.getDepartmentName()) && !" ".equalsIgnoreCase(department.getDepartmentName())) {
			deptData.setDepartmentName(department.getDepartmentName());
		}
		if (Objects.nonNull(department.getDepartmentAddress())
				&& !" ".equalsIgnoreCase(department.getDepartmentAddress())) {
			deptData.setDepartmentAddress(department.getDepartmentAddress());
		}
		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			deptData.setDepartmentCode(department.getDepartmentCode());
		}
		return departmentRepository.save(deptData);

	}

	@Override
	public void DeleteDepartment(Long departmentId) {
		departmentRepository.deleteById(departmentId);

	}

}
