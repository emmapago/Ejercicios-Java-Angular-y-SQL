package es.http.service.service;

import java.util.List;

import es.http.service.dto.Producto;



public interface IProductoService {

	//Metodos del CRUD
		public List<Producto> listarProductos(); //Listar All 
		
		public Producto guardarProducto(Producto producto);	//Guarda un producto CREATE
		
		public Producto productoXID(int id); //Leer datos de un producto READ
		
		public Producto actualizarProducto(Producto producto); //Actualiza datos del producto UPDATE
		
		public void eliminarProducto(int id);// Elimina el producto DELETE
	

}


