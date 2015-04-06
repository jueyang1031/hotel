package edu.neu.cs5200.hotel.test;

import java.util.Date;

import edu.neu.cs5200.hotel.request.CreateCustomerReq;
import edu.neu.cs5200.hotel.service.RegisterCustomer;

public class CreateCustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterCustomer registerCustomer = new RegisterCustomer();
		CreateCustomerReq createCustomerReq = new CreateCustomerReq();
		createCustomerReq.setFirstName("Jue");
		createCustomerReq.setLastName("Yang");
		createCustomerReq.setPassword("12334");
		createCustomerReq.setRegDate(new Date(System.currentTimeMillis()));
		createCustomerReq.setTelephone("99888");
		createCustomerReq.setUsername("jue.yang");
		registerCustomer.createCustomer(createCustomerReq);
	}

}
