package model.dao;

import java.util.List;

import model.entities.Vendedores;

public interface VendedoresDao {
	
	void insert(Vendedores obj);
    void update(Vendedores obj);
    void deleteById(Integer codvend);
    Vendedores findById(Integer codvend);
    List<Vendedores> findAll();

}
