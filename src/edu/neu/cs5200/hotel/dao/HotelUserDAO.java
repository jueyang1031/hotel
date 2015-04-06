package edu.neu.cs5200.hotel.dao;

import edu.neu.cs5200.hotel.basedao.BaseDAO;
import edu.neu.cs5200.hotel.domain.HotelUser;

public class HotelUserDAO {
	private BaseDAO<HotelUser> baseDAO;
	
	public HotelUserDAO(){
		super();
		this.baseDAO=new BaseDAO<HotelUser>();
	}
	public void createHotelUser(HotelUser hoteluser) {
		// TODO Auto-generated method stub
		baseDAO.create(hoteluser);
		
		
		
		
	}

}
