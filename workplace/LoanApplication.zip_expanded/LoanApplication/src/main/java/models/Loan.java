package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {

	@Id
	@Column(name="loan_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loan_id;
	
	@Column(name="loan_type")
	private String loan_type;
	
	//constructor of super class
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor
	public Loan(int loan_id, String loan_type) {
		super();
		this.loan_id = loan_id;
		this.loan_type = loan_type;
	}

	//getter and setter for loan_id
	public int getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}

	//getter and setter for loan_type
	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	//tostring
	@Override
	public String toString() {
		return "Loan [loan_id=" + loan_id + ", loan_type=" + loan_type + "]";
	}
	
	
	
	
	
	
	
	
	
}
