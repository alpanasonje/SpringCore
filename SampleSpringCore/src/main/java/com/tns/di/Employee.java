package com.tns.di;

import java.util.ArrayList;

public class Employee {
	int empNo;
	String name;
	float salary;
	ArrayList<Long> contactNo;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int empNo, String name, float salary, ArrayList<Long> contactNo) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.contactNo = contactNo;
	}


	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	public ArrayList<Long> getContactNo() {
		return contactNo;
	}


	public void setContactNo(ArrayList<Long> contactNo) {
		this.contactNo = contactNo;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + ", contactNo=" + contactNo + "]";
	}


	

}
