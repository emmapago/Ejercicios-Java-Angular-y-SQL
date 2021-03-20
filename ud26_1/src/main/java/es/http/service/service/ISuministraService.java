package es.http.service.service;

import java.util.List;

import es.http.service.dto.Suministra;



public interface ISuministraService {

	//Metodos del CRUD
		public List<Suministra> listarSuministros(); //Listar All 
		
		public Suministra guardarSuministra(Suministra suministra);	//Guarda una suministra CREATE
		
		public Suministra suministraXID(int id); //Leer datos de una suministra READ
		
		public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos de la suministra UPDATE
		
		public void eliminarSuministra(int id);// Elimina la suministra DELETE
	

}
