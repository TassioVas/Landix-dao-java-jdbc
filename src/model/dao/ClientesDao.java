package model.dao;

import java.util.List;

import model.entities.Clientes;

public interface ClientesDao {
	
	void insert(Clientes obj);
    void update(Clientes obj);
    void deleteById(Integer cdcl);
    Clientes findById(Integer cdcl);
    List<Clientes> findAll();

}
