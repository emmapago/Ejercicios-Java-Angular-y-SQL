package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IFacultatDAO;
import es.http.service.dto.Facultat;

@Service
public class FacultatServiceImpl implements IFacultatService {
	
	@Autowired
	IFacultatDAO iFacultatDAO;

	@Override
	public List<Facultat> listarFacultades() {
		return iFacultatDAO.findAll();
	}

	@Override
	public Facultat guardarFacultat(Facultat facultat) {
		return iFacultatDAO.save(facultat);
	}

	@Override
	public Facultat facultat(int id) {
		return iFacultatDAO.findById(id).get();
	}

	@Override
	public Facultat actualizarFacultat(Facultat facultat) {
		return iFacultatDAO.save(facultat);
	}

	@Override
	public void eliminarFacultat(int id) {
		iFacultatDAO.deleteById(id);
	}

}
