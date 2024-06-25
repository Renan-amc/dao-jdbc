package model.dao;

import db.DBManual;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DBManual.getConnection());
	}
	
}

