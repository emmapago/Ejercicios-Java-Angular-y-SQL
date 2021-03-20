package es.http.service.service;

import java.util.List;

import es.http.service.dto.Proveedor;



public interface IProveedorService {

	//Metodos del CRUD
		public List<Proveedor> listarProveedores(); //Listar All 
		
		public Proveedor guardarProveedor(Proveedor proveedor);	//Guarda un proveedor CREATE
		
		public Proveedor proveedorXID(int id); //Leer datos de un proveedor READ
		
		public Proveedor actualizarProveedor(Proveedor proveedor); //Actualiza datos del proveedor UPDATE
		
		public void eliminarProveedor(int id);// Elimina el proveedor DELETE
	

}
