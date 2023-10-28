package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.ICustomerService;
import models.Customers;

@RestController
	@RequestMapping("/api/customers")
	public class CustomerController {

	    @Autowired
	    private ICustomerService customerService;

	    @PostMapping("/register")
	    public ResponseEntity<Customers> registerCustomer(@RequestBody Customers customer) {
	        // Validate customer data and register
	        Customers registeredCustomer = customerService.registerCustomer(customer);
	        return new ResponseEntity<>(registeredCustomer, HttpStatus.CREATED);
	    }

//	    @PostMapping("/login")
//	    public ResponseEntity<Customers> login(@RequestBody CustomerLoginRequest loginRequest) {
//	        // Validate login and return the customer if successful
//	        Customers customer = customerService.login(loginRequest.getEmail(), loginRequest.getPassword);
//	        return new ResponseEntity<>(customer, HttpStatus.OK);
//	    }

	 
	}


