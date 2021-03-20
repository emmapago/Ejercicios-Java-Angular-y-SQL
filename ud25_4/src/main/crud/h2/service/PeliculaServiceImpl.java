package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPeliculaDAO;
import com.crud.h2.dto.Pelicula;

@Service
	public class PeliculaServiceImpl implements IPeliculaService{
		
		//Utilizamos los metodos de la interface IPeliculaDAO, es como si instaciaramos.
		@Autowired
		IPeliculaDAO iPeliculaDAO;
		
		@Override
		public List<Pelicula> listarPeliculas() {
			
			return iPeliculaDAO.findAll();
		}

		@Override
		public Pelicula guardarPelicula(Pelicula pelicula) {
			
			return iPeliculaDAO.save(pelicula);
		}

		@Override
		public Pelicula pelicula(Long id) {
			
			return iPeliculaDAO.findById(id).get();
		}

		@Override
		public Pelicula actualizarPelicula(Pelicula pelicula) {
			
			return iPeliculaDAO.save(pelicula);
		}

		@Override
		public void eliminarPelicula(Long id) {
			
			iPeliculaDAO.deleteById(id);
			
		}

	}

}

}
