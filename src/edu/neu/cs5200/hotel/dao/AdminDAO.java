package edu.neu.cs5200.hotel.dao;

import edu.neu.cs5200.hotel.basedao.BaseDAO;
import edu.neu.cs5200.hotel.domain.Admin;

public class AdminDAO {

		private BaseDAO<Admin> baseDAO;

		public AdminDAO() {
			super();
			this.baseDAO = new BaseDAO<Admin>();
		}
		
public void createAdmin(Admin admin) {
			// TODO Auto-generated method stub
		baseDAO.create(admin);
		
	}

}
