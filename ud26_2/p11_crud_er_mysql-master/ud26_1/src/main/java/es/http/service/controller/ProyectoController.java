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

import es.http.service.dto.Proyecto;
import es.http.service.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	
	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoServiceImpl.listarProyectos();
	}
	
	
	@PostMapping("/proyectos")
	public Proyecto salvarProyecto(@RequestBody Proyecto proyecto) {
		
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	
	@GetMapping("/proyectos/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") int id) {
		
		Proyecto Proyecto_xid= new Proyecto();
		
		Proyecto_xid=proyectoServiceImpl.proyectoXID(id);
		
		System.out.println("Proyecto XID: "+Proyecto_xid);
		
		return Proyecto_xid;
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")int id,@RequestBody Proyecto proyecto) {
		
		Proyecto Proyecto_seleccionado= new Proyecto();
		Proyecto Proyecto_actualizado= new Proyecto();
		
		Proyecto_seleccionado= proyectoServiceImpl.proyectoXID(id);
		
		Proyecto_seleccionado.setId(Proyecto.getId());
		Proyecto_seleccionado.setNombre(Proyecto.getNombre());
		Proyecto_seleccionado.setHoras(Proyecto.getHoras());

		
		Proyecto_actualizado = proyectoServiceImpl.actualizarProyecto(Proyecto_seleccionado);
		
		System.out.println("El Proyecto actualizado es: "+ Proyecto_actualizado);
		
		return Proyecto_actualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eleiminarProyecto(@PathVariable(name="id")int id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
	
	
}
