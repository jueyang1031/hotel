package edu.neu.cs5200.hotel.dao;

import edu.neu.cs5200.hotel.basedao.BaseDAO;
import edu.neu.cs5200.hotel.domain.Customer;

public class CustomerDAO {

	private BaseDAO<Customer> baseDAO;

	public CustomerDAO() {
		super();
		this.baseDAO = new BaseDAO<Customer>();
	}
	
	public void createCustomer(Customer customer) {
		baseDAO.create(customer);
	}
	
	
	
}
