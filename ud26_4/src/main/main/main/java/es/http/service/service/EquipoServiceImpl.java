package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IEquipoDAO;
import es.http.service.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService {
	
	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipo> listarEquipos() {
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo guardarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo equipo(int id) {
		return iEquipoDAO.findById(id).get();
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(int id) {
		iEquipoDAO.deleteById(id);
	}

}
