package com.department.department.entity;

import java.sql.Blob;

import org.hibernate.annotations.JdbcTypeCode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentFile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    
	/*
	 * @Lob private byte [] file;
	 */
    
    @Lob
    private Blob data;
    
    
}
