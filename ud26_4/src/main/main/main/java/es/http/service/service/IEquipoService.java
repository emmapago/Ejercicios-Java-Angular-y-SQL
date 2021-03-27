package es.http.service.service;

import java.util.List;

import es.http.service.dto.Equipo;



public interface IEquipoService {

	//Metodos del CRUD
		public List<Equipo> listarEquipos(); //Listar All 
		
		public Equipo guardarEquipo(Equipo equipo);	//Guarda un cajero CREATE
		
		public Equipo equipoXID(int id); //Leer datos de un cajero READ
		
		public Equipo actualizarEquipo(Equipo equipo); //Actualiza datos del cajero UPDATE
		
		public void eliminarEquipo(int id);// Elimina el cajero DELETE
	

}


