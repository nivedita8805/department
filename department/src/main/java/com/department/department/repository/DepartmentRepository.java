package com.department.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.department.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
