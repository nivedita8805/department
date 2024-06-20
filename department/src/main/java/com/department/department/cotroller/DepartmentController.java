package com.department.department.cotroller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.department.entity.Department;
import com.department.department.service.DepartmentService;
import com.department.department.util.ExcelGenerator;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartmentData(department);
	}

	@GetMapping("/department")
	public List<Department> featchDepartmentList() {
		return departmentService.feachDepartmentList();
	}

	@PutMapping("/department/{id}")
	public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long Id) {
		return departmentService.upadateDeapartmentData(department, Id);
	}

	@DeleteMapping("/department/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.DeleteDepartment(departmentId);
		return "Deleted Successfully";

	}
}
