package com.department.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.department.department.entity.DepartmentFile;

@Repository
public interface DepartmetFileRepository  extends JpaRepository<DepartmentFile, Long>{

}
