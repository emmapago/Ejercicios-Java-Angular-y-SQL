
	package com.example.demo;
	import java.util.List;

	/**
	 * @author Emma
	 *
	 */
	import com.crud.h2.dto.Pelicula;

	public class IPeliculaService {


		//Metodos del CRUD
		public List<Pelicula> listarPelicula(); //Listar All 
		
		public Pelicula guardarPelicula(Pelicula pelicula);	//Guarda una pelicula CREATE
		
		public Pelicula peliculaXID(Long id); //Leer datos de una pelicula READ
		
		public Pelicula actualizarPelicula(Pelicula pelicula); //Actualiza datos de la pelicula UPDATE
		
		public void eliminarPelicula(Long id);// Elimina la pelicula DELETE
		
		
	}

	
	
	
}

	
	
	
	
	
	
	
}
