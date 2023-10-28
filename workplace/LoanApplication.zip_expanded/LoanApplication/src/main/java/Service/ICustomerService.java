package Service;

import models.Customers;

public interface ICustomerService {

	//registration
	Customers registerCustomer(Customers customer);

	//login 
	Customers login(String email, String password);
	
	//view loan
	public String LoanStatus(int customerId);

}