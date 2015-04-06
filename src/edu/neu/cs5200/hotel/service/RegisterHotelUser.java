package edu.neu.cs5200.hotel.service;

import edu.neu.cs5200.hotel.dao.HotelDAO;
import edu.neu.cs5200.hotel.dao.HotelUserDAO;
import edu.neu.cs5200.hotel.domain.HotelUser;
import edu.neu.cs5200.hotel.request.CreateHotelUserReq;

public class RegisterHotelUser {
	public void registerHotelUser(CreateHotelUserReq createHotelUserReq){
	HotelUser hoteluser= new HotelUser();
	hoteluser.setPassword(createHotelUserReq.getPassword());
	hoteluser.setRegDate(createHotelUserReq.getRegDate());
	hoteluser.setSsn(createHotelUserReq.getSsn());
	hoteluser.setUsername(createHotelUserReq.getUsername());
	
	HotelUserDAO hoteluserDAO=new HotelUserDAO();
	hoteluserDAO.createHotelUser(hoteluser);
}
}
