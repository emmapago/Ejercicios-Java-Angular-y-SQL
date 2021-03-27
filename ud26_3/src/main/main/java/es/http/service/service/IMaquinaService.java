package es.http.service.service;

import java.util.List;

import es.http.service.dto.Mquina;



public interface IMaquinaService {

	//Metodos del CRUD
		public List<Maquina> listarMaquinas(); //Listar All 
		
		public Maquina guardarMaquina(Maquina maquina);	//Guarda una maquina CREATE
		
		public Maquina maquinaXID(int id); //Leer datos de una maquina READ
		
		public Maquina actualizarMaquina(Maquina maquina); //Actualiza datos de la maquina UPDATE
		
		public void eliminarMaquina(int id);// Elimina la maquina DELETE
	

}


