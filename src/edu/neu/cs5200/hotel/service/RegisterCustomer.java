package edu.neu.cs5200.hotel.service;

import edu.neu.cs5200.hotel.dao.CustomerDAO;
import edu.neu.cs5200.hotel.domain.Customer;
import edu.neu.cs5200.hotel.request.CreateCustomerReq;

public class RegisterCustomer {
	
	public void createCustomer(CreateCustomerReq createCustomerReq) {
		Customer customer = new Customer();
		customer.setFirstName(createCustomerReq.getFirstName());
		customer.setLastName(createCustomerReq.getLastName());
		customer.setTelephone(createCustomerReq.getTelephone());
		customer.setRegDate(createCustomerReq.getRegDate());
		customer.setUsername(createCustomerReq.getUsername());
		customer.setPassword(createCustomerReq.getPassword());
		
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.createCustomer(customer);
	}
}
