package edu.neu.cs5200.hotel.test;

import java.util.Date;

import edu.neu.cs5200.hotel.request.CreateCustomerReq;
import edu.neu.cs5200.hotel.service.RegisterCustomer;

public class CreateCustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateCustomerReq createCustomerReq = new CreateCustomerReq();
		createCustomerReq.setFirstName("Bob");
		createCustomerReq.setLastName("Bench");
		createCustomerReq.setPassword("88769100");
		createCustomerReq.setRegDate(new Date(System.currentTimeMillis()));
		createCustomerReq.setTelephone("888776109");
		createCustomerReq.setUsername("BBB");
		
		RegisterCustomer registerCustomer = new RegisterCustomer();
		registerCustomer.createCustomer(createCustomerReq);

	}

}
