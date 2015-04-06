package edu.neu.cs5200.hotel.test;

import edu.neu.cs5200.hotel.request.CreateAdminReq;
import edu.neu.cs5200.hotel.service.RegisterAdmin;

public class CreateAdminTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterAdmin registerAdmin = new RegisterAdmin();
		CreateAdminReq createAdminReq = new CreateAdminReq();
		createAdminReq.setPassword("lol");
		createAdminReq.setSponsoraccount("bigguy");
		createAdminReq.setUsername("dddguy");
		registerAdmin.createAdmin(createAdminReq);
		
		}
}
