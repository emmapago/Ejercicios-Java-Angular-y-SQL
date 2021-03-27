package es.http.service.service;

import java.util.List;

import es.http.service.dto.Venta;



public interface IVentaService {

	//Metodos del CRUD
		public List<Venta> listarVentas(); //Listar All 
		
		public Venta guardarVenta(Venta venta);	//Guarda una venta CREATE
		
		public Venta ventaXID(int id); //Leer datos de una venta READ
		
		public Venta actualizarVenta(Venta venta); //Actualiza datos de la venta UPDATE
		
		public void eliminarVenta(int id);// Elimina la venta DELETE
	

}


