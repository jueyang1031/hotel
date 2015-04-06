package edu.neu.cs5200.hotel.test;

import java.util.Date;

import edu.neu.cs5200.hotel.request.CreateHotelUserReq;
import edu.neu.cs5200.hotel.service.RegisterHotelUser;

public class CreatHotelUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateHotelUserReq createHotelUser=new CreateHotelUserReq();
		createHotelUser.setPassword("23441234");
		createHotelUser.setRegDate(new Date(System.currentTimeMillis()));
		createHotelUser.setSsn("93402");
		createHotelUser.setUsername("3243242");
		
		RegisterHotelUser registerHotelUser=new RegisterHotelUser();
		registerHotelUser.registerHotelUser(createHotelUser);
	}

}
