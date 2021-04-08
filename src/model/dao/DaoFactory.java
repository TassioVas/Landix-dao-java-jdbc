package model.dao;

import db.DB;
import model.dao.impl.ClientesDaoJDBC;

public class DaoFactory {
	
	public static ClientesDao createClientesDao() {
		return new ClientesDaoJDBC(DB.getConnection());
	}

}
