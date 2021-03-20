package es.http.service.service;

import java.util.List;

import es.http.service.dto.Pieza;



public interface IPiezaService {

	//Metodos del CRUD
		public List<Pieza> listarPiezas(); //Listar All 
		
		public Pieza guardarPieza(Pieza pieza);	//Guarda una pieza CREATE
		
		public Pieza piezaXID(int id); //Leer datos de una pieza READ
		
		public Pieza actualizarPieza(Pieza pieza); //Actualiza datos de la pieza UPDATE
		
		public void eliminarPieza(int id);// Elimina la pieza DELETE
	

}


