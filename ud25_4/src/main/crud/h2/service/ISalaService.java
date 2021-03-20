
	package com.example.demo;
	import java.util.List;

	/**
	 * @author Emma
	 *
	 */
	import com.crud.h2.dto.Sala;

	public class ISalaService {


		//Metodos del CRUD
		public List<Sala> listarSala(); //Listar All 
		
		public Sala guardarSala(Sala sala);	//Guarda una sala CREATE
		
		public Sala salaXID(Long id); //Leer datos de una sala READ
		
		public Sala actualizarSala(Sala sala); //Actualiza datos de la sala UPDATE
		
		public void eliminarSala(Long id);// Elimina la sala DELETE
		
		
	}

	
	
	
}

	
	
	
	
	
	
	
}
