package com.department.department.service;

import java.io.IOException;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.stream.Stream;

import javax.sql.rowset.serial.SerialException;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.department.department.entity.DepartmentFile;

public interface FilesStorageService {

	  public void init();

	  public DepartmentFile save(DepartmentFile departmentFile ,MultipartFile file) throws IOException, SerialException, SQLException;

	  public Resource load(String filename);

	  public void deleteAll();

	  public Stream<Path> loadAll();
}
