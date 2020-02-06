package com.voila.hibernate.start.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
	@Id
	private int empId;
	@Column(name="employee_name")// here we can change attribute name as per our understanding
	private String empname;
	private String desig; // "desig" will be attribute in table cuase we haven't change the name
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empname, String desig) {
		this.empId = empId;
		this.empname = empname;
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", desig=" + desig + "]";
	}
	

}
