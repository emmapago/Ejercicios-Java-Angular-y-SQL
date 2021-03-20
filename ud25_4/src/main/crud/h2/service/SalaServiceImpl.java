package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISalaDAO;
import com.crud.h2.dto.Sala;

@Service
	public class SalaServiceImpl implements ISalaService{
		
		//Utilizamos los metodos de la interface ISalaDAO, es como si instaciaramos.
		@Autowired
		ISalaDAO iSalaDAO;
		
		@Override
		public List<Sala> listarSalas() {
			
			return iSalaDAO.findAll();
		}

		@Override
		public Sala guardarSala(Sala sala) {
			
			return iSalaDAO.save(sala);
		}

		@Override
		public Sala sala(Long id) {
			
			return iSalaDAO.findById(id).get();
		}

		@Override
		public Sala actualizarSala(Sala sala) {
			
			return iSalaDAO.save(sala);
		}

		@Override
		public void eliminarSala(Long id) {
			
			iSalaDAO.deleteById(id);
			
		}

	}

}

}
