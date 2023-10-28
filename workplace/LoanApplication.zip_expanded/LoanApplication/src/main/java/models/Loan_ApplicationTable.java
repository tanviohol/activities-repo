package models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="loan_application")
public class Loan_ApplicationTable {
	@Id
	@Column(name="application_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int application_id;
	
	@Column(name="customer_id")
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	//foreignkey refering to Customers table
	private Customers customer_id;
	
	@Column(name="loan_id")
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="loan_id")
	//foreignkey refering to Loan table
	private Loan loan_id;
	private String status;
	
	//constructor
	public Loan_ApplicationTable(int application_id, Customers customer_id, Loan loan_id, String status) {
		super();
		this.application_id = application_id;
		this.customer_id = customer_id;
		this.loan_id = loan_id;
		this.status = status;
	}
	
	//superclass constructor
	public Loan_ApplicationTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter and setter for application_id
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	
	//getter and setter for customer_id
	public Customers getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Customers customer_id) {
		this.customer_id = customer_id;
	}
	
	//getter and setter for Loan_id
	public Loan getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(Loan loan_id) {
		this.loan_id = loan_id;
	}
	
	//getter and setter for status 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Loan_ApplicationTable [application_id=" + application_id + ", customer_id=" + customer_id + ", loan_id="
				+ loan_id + ", status=" + status + "]";
	}
	
	
}
