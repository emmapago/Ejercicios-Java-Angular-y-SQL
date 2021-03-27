package es.http.service.service;

import java.util.List;

import es.http.service.dto.Facultat;



public interface IFacultatService {

	//Metodos del CRUD
		public List<Facultat> listarFacultades(); //Listar All 
		
		public Facultat guardarFacultat(Facultat facultat);	//Guarda un cajero CREATE
		
		public Facultat facultatXID(int id); //Leer datos de un cajero READ
		
		public Facultat actualizarFacultat(Facultat facultat); //Actualiza datos del cajero UPDATE
		
		public void eliminarFacultat(int id);// Elimina el cajero DELETE
	

}


