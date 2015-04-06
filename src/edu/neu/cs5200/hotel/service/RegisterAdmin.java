package edu.neu.cs5200.hotel.service;

import edu.neu.cs5200.hotel.dao.AdminDAO;
import edu.neu.cs5200.hotel.dao.CustomerDAO;
import edu.neu.cs5200.hotel.domain.Admin;
import edu.neu.cs5200.hotel.request.CreateAdminReq;

public class RegisterAdmin {
	public void createAdmin(CreateAdminReq createAdminReq){
		Admin admin = new Admin();
		admin.setPassword(createAdminReq.getPassword());
		admin.setSponsoraccount(createAdminReq.getSponsoraccount());
		admin.setUsername(createAdminReq.getUsername());
		
		AdminDAO adminDAO = new AdminDAO();
		adminDAO.createAdmin(admin);
	}
}
