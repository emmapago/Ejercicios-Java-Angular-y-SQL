package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Equipo;
import es.http.service.service.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {
	
	@Autowired
	EquipoServiceImpl equipoServiceImpl;
	
	@GetMapping("/equipos")
	public List<Equipo> listarEquipos(){
		return equipoServiceImpl.listarEquipos();
	}
	
	
	@PostMapping("/equipos")
	public Equipo salvarEquipo(@RequestBody Equipo equipo) {
		
		return equipoServiceImpl.guardarEquipo(equipo);
	}
	
	
	@GetMapping("/equipos/{id}")
	public Equipo equiposXID(@PathVariable(name="id") int id) {
		
		Equipo Equipo_xid= new Equipo();
		
		Equipo_xid=equipoServiceImpl.equipoXID(id);
		
		System.out.println("Equipo XID: "+Equipo_xid);
		
		return Equipo_xid;
	}
	
	@PutMapping("/equipos/{id}")
	public Equipo actualizarEquipo(@PathVariable(name="id")int id,@RequestBody Equipo equipo) {
		
		Equipo Equipo_seleccionado= new Equipo();
		Equipo Equipo_actualizado= new Equipo();
		
		Equipo_seleccionado= equipoServiceImpl.equipoXID(id);
		
		Equipo_seleccionado.setNumSerie(Equipo.getNumSerie());
		Equipo_seleccionado.setNombre(Equipo.getNombre());
		Equipo_seleccionado.setFacultat(Equipo.getFacultat());

		
		Equipo_actualizado = equipoServiceImpl.actualizarEquipo(Equipo_seleccionado);
		
		System.out.println("La Equipo actualizado es: "+ Equipo_actualizado);
		
		return Equipo_actualizado;
	}
	
	@DeleteMapping("/equipos/{id}")
	public void eliminarEquipo(@PathVariable(name="id")int id) {
		equipoServiceImpl.eliminarEquipo(id);
	}
	
	
}
