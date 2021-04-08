package model.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import db.DB;
import db.DbException;
import model.dao.ClientesDao;
import model.entities.Clientes;
import model.entities.Vendedores;

public class ClientesDaoJDBC implements ClientesDao {
	
	private Connection conn;
	
	public ClientesDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Clientes obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Clientes obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer cdcl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clientes findById(Integer cdcl) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = (PreparedStatement) conn.prepareStatement("Select clientes.*, vendedores.DSNOME as vendNome " 
				    + "FROM clientes "
					+ "INNER join vendedores on clientes.CODVEND = vendedores.CODVEND "
					+ "WHERE clientes.cdcl = ? "
					);
				st.setInt(1, cdcl);
				rs = st.executeQuery();
				if (rs.next()) {
					Vendedores cli = new Vendedores();
					cli.setcodvend(rs.getInt("CODVEND"));
					cli.setdsnome(rs.getString("DSNOME"));
					Clientes obj = new Clientes();
					obj.setCdcl(rs.getInt("CODVEND"));
					obj.setDsnome(rs.getString("DSNOME"));
					obj.setIdtipo(rs.getInt("IDTIPO"));
					obj.setDslim(rs.getDouble("DSLIM"));
					obj.setVendedores(cli);
					return obj;
				}
				return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
