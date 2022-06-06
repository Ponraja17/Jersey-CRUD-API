package com.db;

import java.sql.Connection;

public class Bean {
//	public Bean(String id,String EmpName,String department,String salary,String age) {
//		this.id=id;
//		this.EmpName=EmpName;
//		this.department=department;
//		this.salary=salary;
//		this.age=age;
//	}
	

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	private String name,rn,cn,department,EmpName,salary,age,id;

	public String getRn() {
		return rn;
	}
	public void setRn(String rn) {
		this.rn = rn;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}

	private Connection connection=null;
	
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String Informat() {
		return new StringBuffer(" Employee id : ").append(this.id)
				.append(" Employee name : ").append(this.EmpName)
				.append(" department : ").append(this.department)
				.append(" salary : ")
				.append(this.salary).append(" age : ")
				.append(this.age).toString();
	}

		
}
