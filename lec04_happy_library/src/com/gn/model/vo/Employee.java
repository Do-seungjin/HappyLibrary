package com.gn.model.vo;

public class Employee {
	private int employee_no;
	private String employee_id;
	private String employee_pwd;
	private String employee_name;
	private String employee_possible;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employee_no, String employee_id, String employee_pwd, String employee_name,
			String employee_possible) {
		super();
		this.employee_no = employee_no;
		this.employee_id = employee_id;
		this.employee_pwd = employee_pwd;
		this.employee_name = employee_name;
		this.employee_possible = employee_possible;
	}
	public int getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(int employee_no) {
		this.employee_no = employee_no;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_pwd() {
		return employee_pwd;
	}
	public void setEmployee_pwd(String employee_pwd) {
		this.employee_pwd = employee_pwd;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_possible() {
		return employee_possible;
	}
	public void setEmployee_possible(String employee_possible) {
		this.employee_possible = employee_possible;
	}
	@Override
	public String toString() {
		return  employee_no + "||" + employee_id + "||"
				+ employee_pwd + "||" + employee_name + "||" + employee_possible;
	}
	
	
}
