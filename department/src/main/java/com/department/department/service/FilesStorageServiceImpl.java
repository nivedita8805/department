package com.department.department.service;

import java.io.IOException;
import java.nio.file.Path;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.stream.Stream;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.department.department.entity.DepartmentFile;
import com.department.department.repository.DepartmentRepository;
import com.department.department.repository.DepartmetFileRepository;

@Service
public class FilesStorageServiceImpl implements FilesStorageService{

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	DepartmetFileRepository fileRepository; 
	

	

	@Override
	public Resource load(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stream<Path> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public DepartmentFile save(DepartmentFile departmentFile, MultipartFile file) throws IOException, SerialException, SQLException {
		Blob blob = new SerialBlob(file.getBytes());
		departmentFile.setData(blob);
		System.out.println("====="+departmentFile);
		return fileRepository.save(departmentFile);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
