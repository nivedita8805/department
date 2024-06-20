package com.department.department.cotroller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.department.department.entity.Department;
import com.department.department.entity.DepartmentFile;
import com.department.department.service.DepartmentService;
import com.department.department.service.FilesStorageService;
import com.department.department.util.ExcelGenerator;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class FileController {

	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	FilesStorageService filesStorageService;
	
	@GetMapping("/export-to-excel")
    public void exportIntoExcelFile(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=department" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);

        List <Department> listOfStudents = departmentService.feachDepartmentList();
        ExcelGenerator generator = new ExcelGenerator(listOfStudents);
        generator.generateExcelFile(response);
        
	}   
	
	@PostMapping(value = "/fileUpload",consumes = {"multipart/form-data"} )
	public DepartmentFile saveDepartment(DepartmentFile department ,@RequestPart(value = "file" ,required = false) MultipartFile file) throws IOException, SerialException, SQLException {
		DepartmentFile departmentFile = filesStorageService.save(department, file);
		return departmentFile;
	}
}
