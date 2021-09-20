package com.asu.application.model;

public class Employee {
	String name;
	Long emp_id;
	String detail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Employee(String name, Long emp_id, String detail) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp_id=" + emp_id + ", detail=" + detail + "]";
	}
	
	
	
	
	

}
