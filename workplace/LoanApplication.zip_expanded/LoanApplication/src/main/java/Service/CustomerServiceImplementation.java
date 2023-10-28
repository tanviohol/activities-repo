package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.CustomerRepository;
import models.Customers;


	@Service
	public class CustomerServiceImplementation implements ICustomerService {

	    private  CustomerRepository customerRepository;
	    


	    //registration
	    @Override
		public Customers registerCustomer(Customers customer) {
	        // Validate customer data
	        validateCustomerData(customer);

	        // Check if a customer with the same email already exists
	        Customers existingCustomer = customerRepository.findByEmail(customer.getEmail_id());
	        if (existingCustomer != null) {
	            throw new IllegalArgumentException("Customer with this email already exists");
	        }

	      

	        // Save the customer
	        return customerRepository.save(customer);
	    }

	    private void validateCustomerData(Customers customer) {
	        if (customer.getFirstname() == null || customer.getLastname() == null || customer.getEmail_id() == null) {
	            throw new IllegalArgumentException("Customer data is incomplete");
	        }
	        if (customer.getFirstname().length() < 3) {
	            throw new IllegalArgumentException("First name must be at least 3 characters");
	        }
	        if (customer.getLastname().length() < 1) {
	            throw new IllegalArgumentException("Last name must be at least 1 character");
	        }
	        if (!isValidEmail(customer.getEmail_id())) {
	            throw new IllegalArgumentException("Invalid email address");
	        }
	        if (customer.getPhone() != 0 && !isValidPhoneNumber(customer.getPhone())) {
	            throw new IllegalArgumentException("Invalid phone number");
	        }
	        if (customer.getPassword().length() < 8) {
	            throw new IllegalArgumentException("Password must be at least 8 characters");
	        }
	    }

	    private boolean isValidEmail(String email) {
	        // Implement email validation logic (regex, etc.) here
	        // Return true if the email is valid, false otherwise
	        return true;
	    }

	    private boolean isValidPhoneNumber(long l) {
	        // Implement phone number validation logic here (regex, length, etc.)
	        // Return true if the phone number is valid, false otherwise
	        return true;
	    }
	    
	    
	    //login 
	    @Override
		public Customers login(String email, String password) {
	        Customers customer = customerRepository.findByEmail(email);
	        if (customer != null && customer.getPassword().equals(password)) {
	            return customer;
	        }
	        return null; // Login failed
	    }

		@Override
		public String LoanStatus(int customerId) {
			// TODO Auto-generated method stub
			return null;
		}
	    
	    

	    
	    
	    
	    
	}



