package models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Employee {

	//Employee attributes
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employee_id;
	
	@Column(name="employee_name")
	private String employee_name;
	
	@Column(name="email_id")
	private String email_id;
	
	@Column(name="password")
	private String password;
	
	//constructor
	public Employee(int employee_id, String employee_name, String email_id, String password) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.email_id = email_id;
		this.password = password;
	}
	
	//default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter and setter for emp_id
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	//getter and setter for emp_name
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	
	//getter and setter for email_id
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	//getter and setter for password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", email_id=" + email_id
				+ ", password=" + password + "]";
	}
	
	
	
	
}
