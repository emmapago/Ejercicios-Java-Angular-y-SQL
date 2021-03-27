package es.http.service.service;

import java.util.List;

import es.http.service.dto.Investigador;



public interface IInvestigadorService {

	//Metodos del CRUD
		public List<Investigador> listarInvestigadores(); //Listar All 
		
		public Investigador guardarInvestigador(Investigador investigador);	//Guarda un cajero CREATE
		
		public Investigador investigadorXID(int id); //Leer datos de un cajero READ
		
		public Investigador actualizarInvestigador(Investigador investigador); //Actualiza datos del cajero UPDATE
		
		public void eliminarInvestigador(int id);// Elimina el cajero DELETE
	

}


