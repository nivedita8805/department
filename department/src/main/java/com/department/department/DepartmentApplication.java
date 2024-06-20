package com.department.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.department.department.entity.Department;
import com.department.department.service.DepartmentService;
//https://springjava.com/spring-boot/export-data-to-excel-file-in-spring-boot/
@SpringBootApplication
public class DepartmentApplication {

	@Autowired
	DepartmentService departmentService;
	
	public static void main(String[] args) {
		SpringApplication.run(DepartmentApplication.class, args);
	}
	
	public void run(String...a) {
        for (int i = 0; i <= 10; i++) {
            Department department = new Department();
            
            department.setDepartmentName("Department Name");
            department.setDepartmentCode("xxxxxx");
            department.setDepartmentAddress("Bagnlore"); 
            department.setDepartmentId(123L);
            departmentService.saveDepartmentData(department);
            
        }

	}
}
