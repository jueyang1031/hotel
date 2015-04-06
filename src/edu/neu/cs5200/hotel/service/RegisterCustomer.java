package edu.neu.cs5200.hotel.service;

import edu.neu.cs5200.hotel.dao.CustomerDAO;
import edu.neu.cs5200.hotel.domain.Customer;

public class RegisterCustomer {
	
	public void createCustomer(String username, String password) {
		Customer customer = new Customer();
		customer.setUsername(username);
		customer.setPassword(password);
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.createCustomer(customer);
	}
}
