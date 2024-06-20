package com.department.department.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    
    
}
