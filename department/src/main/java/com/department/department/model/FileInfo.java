package com.department.department.model;
//https://springjava.com/spring-boot/export-data-to-excel-file-in-spring-boot/
public class FileInfo {
	private String name;
	private String url;

	public FileInfo(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
