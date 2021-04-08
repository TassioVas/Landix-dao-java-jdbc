package application;

import model.entities.Clientes;
import model.entities.Vendedores;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vendedores obj = new Vendedores(2, "joao", 5, null);
		
		Clientes clientes = new Clientes(2, "bob", 2, 1, 2000.0);
		
		System.out.println(obj);
		System.out.println(clientes);
		

	}

}
